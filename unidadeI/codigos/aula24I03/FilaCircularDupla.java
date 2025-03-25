package unidadeI.codigos.aula24I03;

public class FilaCircularDupla implements FilaDupla {
    private Object[] dados;
    private int ponteiroinicio;
    private int ponteirofim;
    private int quantidade;

    public FilaCircularDupla(int tamanho) {
        dados = new Object[tamanho];
        ponteiroinicio = 0;
        ponteirofim = -1;
        quantidade = 0;
    }

    public FilaCircularDupla() {
        this(10);
    }

    @Override
    public void enfileirarInicio(Object dado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enfileirarInicio'");
    }

    @Override
    public void enfileirarFim(Object dado) {
        ponteirofim = (ponteirofim + 1) % dados.length;// abre o espaço
        dados[ponteirofim] = dado;// coloca na casa
        quantidade++;
    }

    @Override
    public Object desenfileirarInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desenfileirarInicio'");
    }

    @Override
    public Object desenfileirarFim() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroinicio];
            ponteiroinicio = (ponteiroinicio + 1) % dados.length;
            quantidade--;
        }

        return aux;
    }

    @Override
    public Object frente() {
        String retorno = "[";
        for (int i = ponteirofim; i < ponteirofim - quantidade; i--) {
            /*
             * if(i==dados.length){
             * i=0;
             * }
             */
            if (i == (quantidade + ponteirofim - 1)) {
                retorno += dados[i % dados.length];
            } else {
                retorno += dados[i % dados.length] + ",";
            }
        }
        return retorno;
    }

    @Override
    public Object tras() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tras'");
    }

    @Override
    public void atualizarFinal(Object dado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarFinal'");
    }

    @Override
    public void atualizarInicio(Object dado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarInicio'");
    }

    @Override
    public boolean estaCheia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estaCheia'");
    }

    @Override
    public boolean estaVazia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estaVazia'");
    }

    @Override
    public String imprimirTrasFrente() {
        String retorno = "[";
        for (int i = ponteirofim; i < ponteirofim - quantidade; i--) {
            /*
             * if(i==dados.length){
             * i=0;
             * }
             */
            if (i == (quantidade + ponteirofim - 1)) {
                retorno += dados[i % dados.length];
            } else {
                retorno += dados[i % dados.length] + ",";
            }
        }
        return retorno;
    }

    @Override
    public String imprimirFrenteTras() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirFrenteTras'");
    }

}
