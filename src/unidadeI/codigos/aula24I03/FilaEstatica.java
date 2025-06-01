package unidadeI.codigos.aula24I03;

public class FilaEstatica implements Fila {
    // variaveis de instância
    private Object[] dados;
    private int ponteiroinicio;
    private int ponteirofim;

    public FilaEstatica(int tamanho) {
        dados = new Object[tamanho];
        ponteiroinicio = 0;
        ponteirofim = -1;
    }

    public FilaEstatica() {
        this(10);
    }

    @Override
    public void enfileirar(Object dado) {
        if (!estaCheia()) {
            ponteirofim++;
            dados[ponteirofim] = dado;
        }
    }

    @Override
    public Object frente() {
        if (!estaVazia()) {
            return dados[ponteiroinicio];
        } else {
            return null;
        }

    }

    @Override
    public void atualizarFinal(Object dado) {
        if (!estaVazia()) {
            dados[ponteirofim] = dado;
        } else {
            System.out.println("erro");
        }
    }

    public void atualizarInicio(Object dado) {
        if (!estaVazia()) {
            dados[ponteiroinicio] = dado;
        } else {
            System.out.println("erro");
        }
    }

    @Override
    public Object desenfileirar() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroinicio];
            ponteiroinicio++;
        }

        return aux;
    }

    @Override
    public boolean estaCheia() {
        return (ponteirofim == dados.length - 1);
    }

    @Override
    public boolean estaVazia() {
        return (ponteirofim == ponteiroinicio - 1);
    }

    @Override
    public String imprimir() {
        String retorno = "[";
        for (int i = ponteiroinicio; i <= ponteirofim; i++) {
            if (i == ponteirofim) {
                retorno += dados[i];
            } else {
                retorno += dados[i] + ",";
            }

        }
        return retorno + "]";
    }

}
