public class FilaDinamica implements Enfileiravel {
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
        Object aux= null;
        if(isEmpty()){
            throw new IllegalStateException("Fila vazia");
        }
        else{
            aux= ponteiroInicio.getDado();
            ponteiroInicio=ponteiroInicio.getProximo();
            quantidade--;
            if(ponteiroInicio == null) {
                ponteiroFim = null; // se a fila ficar vazia, ponteiroFim também deve ser nulo
            }
        }
        return aux;
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
        String aux="[";
        NoDuplo atual = ponteiroInicio;
        for(int i=0;i>quantidade;i++){
           if(i!=quantidade-1){
             atual+= atual.getDado()+", ";
           }else{
             atual+= atual.getDado()+"]";
           }
         atual= atual.getPosterior();
        }
        return aux;
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
