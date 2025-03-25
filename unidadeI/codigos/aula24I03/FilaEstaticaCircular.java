package unidadeI.codigos.aula24I03;

public class FilaEstaticaCircular implements Fila {
    private Object[] dados;
    private int ponteiroinicio;
    private int ponteirofim;
    private int quantidade;

    public FilaEstaticaCircular(int tamanho) {
        dados = new Object[tamanho];
        ponteiroinicio = 0;
        ponteirofim = -1;
        quantidade =0;
    }

    public FilaEstaticaCircular() {
           this(10);
    }

    @Override
    public void enfileirar(Object dado) {
        ponteirofim=(ponteirofim+1)%dados.length;//abre o espaço
        dados[ponteirofim]=dado;//coloca na casa
        quantidade++;
        
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

    @Override
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
            ponteiroinicio=(ponteiroinicio+1)%dados.length;
            quantidade --;
        }

        return aux;
        
    }

    @Override
    public boolean estaCheia() {
        return (quantidade== dados.length);
        
    }

    @Override
    public boolean estaVazia() {
        return(quantidade==0);
    }

    @Override
    public String imprimir() { 
        String retorno ="[";
        for (int i=ponteiroinicio;i<(quantidade+ponteiroinicio);i++){
           /* if(i==dados.length){
                i=0;
            }*/ 
            if(i==(quantidade+ponteirofim-1)){
                retorno+=dados[i%dados.length];
            }else{
                retorno+=dados[i%dados.length]+",";
            }
        }
        return retorno;
    }
    
}
