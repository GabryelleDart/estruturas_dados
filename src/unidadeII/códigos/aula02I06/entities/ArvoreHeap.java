public class ArvoreHeap implements Heapavel {
    private int[] heap;
    private int tamanho;

    public ArvoreHeap(int capacidade) {
        heap = new int[capacidade];
        tamanho = 0;
    }

    @Override
    public int indiceGetPai(int indice) {
        if (indice <= 0 || indice >= tamanho) {
            return -1; // Indice inválido
        }
        return (indice - 1) / 2;
    }

    @Override
    public int indiceGetFilhoEsquerdo(int indice) {
        int filhoEsquerdo = 2 * indice + 1;
        return (filhoEsquerdo < tamanho) ? filhoEsquerdo : -1; // Retorna -1 se não houver filho esquerdo
    }

    @Override
    public int indiceGetFilhoDireito(int indice) {
        int filhoDireito = 2 * indice + 2;
        return (filhoDireito < tamanho) ? filhoDireito : -1; // Retorna -1 se não houver filho direito
    }

}
