public class FilaDinamica implements Listavel {
    private NoDuplo ponteiroInicio;
    private NoDuplo ponteiroFim;
    private int tamanho;
    private int quantidade;

public FilaDinamica() {
        this(100);
    }

    public FilaDinamica(int tamanhoMaximo) {
        this.ponteiroInicio = null;
        this.ponteiroFim = null;
        this.tamanho = tamanhoMaximo;
        this.quantidade =0;
    }
    @Override
    public Object desenfileirar() {
        ()
    }

    @Override
    public void enfileirar(Object dado) {
        if(isFull()){
            throw new IllegalStateException("Fila cheia");
        }else{
            NoDuplo NoTemp= new NoDuplo(dado);
            if(isEmpty()){
                ponteiroFim=NoTemp;
                ponteiroInicio = NoTemp;
            }else{
                ponteiroFim.setProximo(NoTemp);
                NoTemp.setAnterior(ponteiroFim);
                ponteiroFim = NoTemp;
            }
            quantidade++;
        }
        
        
    }

    @Override
    public Object espiar() {
       if(isEmpty()){
            throw new IllegalStateException("Fila vazia");
        }
        return ponteiroInicio.getDado();
    }

    @Override
    public String imprimir() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (quantidade == 0);
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return (quantidade == tamanho);
    }
   
   
}
