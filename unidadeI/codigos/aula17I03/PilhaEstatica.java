public class PilhaEstatica implements Empilhavel{
    // lembrete há 2 formas de implementar a pilha dupla- criando metodos para cada uma delas (melhor) e outra formas seria passar a pilha na hora de chaamr o metodo
    //A classe tem  as variaveis de instancia e metodos
    /*Em metodos tem-se os 3 tipos:
     *         Construtores
     *         Metodos principais
     *         Metodos auxiliares
     */
    //Variaveis de instancia
    private Object[] dados; // tem que ser object pois as operaçoes sem Empilhavel sao sobre object
    private int ponteiroTopo;

    //Construtor
    public PilhaEstatica() {
        dados = new Object[10];
        ponteiroTopo = -1;

    }
    /* Seria possivel fazer desta maneira - chamando o construtor dentro de outro construtor
     * public PilhaEstatica() {
        this(10);
         isso no caso de 2 construtores como no exemplo :

        public PilhaEstatica(int tamanho) {
		ponteiroTopo = -1;
		dados = new Object[tamanho]; 
         
        public PilhaEstatica() {
        dados = new Object[10];
        ponteiroTopo = -1;



    }
        logo para não haver duplicidade nos construtores se escreve assim para determinar o construtor como um array de tamanho 10
        
        public PilhaEstatica(int tamanho) {
		ponteiroTopo = -1;
		dados = new Object[tamanho]; 

        public PilhaEstatica() {
        this(10);
	}
    }
     */

     //Metodos principais
     @Override
     public void empilhar(Object a){
        if(!estaCheia()){
            ponteiroTopo ++;
            dados[ponteiroTopo]=a;
        }else{
            System.err.print("null");
        }
       
    }
    @Override
    public Object desempilhar(){
        Object aux= null;
        if(!estaVazia()){
           aux= dados[ponteiroTopo];
           // se eu quiser limpar : dados[ponteiroTopo]=null
           ponteiroTopo--;
        }
            return aux; // não posso retornar só as vezes logo preciso deixar esse retorno final
            
        }
    
    /* 
    Em código pois essa não é a melhor forma de programar
    @Override
    public Object topo(){
        if(!estaVazia()){
            return dados[ponteiroTopo];
        }
        return null; // não posso retornar so as vezes logo preciso deixar esse retorno final
        
    }
        */
    @Override
    public Object topo(){
        Object aux= null;
        if(!estaVazia()){
           aux= dados[ponteiroTopo];
    
        }
            return aux; // não posso retornar só as vezes logo preciso deixar esse retorno final
            
        }
    @Override
    public void atualizar(Object dado) {
      if (!estaVazia()) {
        dados[ponteiroTopo]= dado;
        
      }else{
        System.err.println("Stack is empty.");
      }
    }
     //Metodos auxiliares - normalmente esses metodos são privados , mas nesse deixamos publico)
     @Override
    public Boolean estaVazia(){
        return(ponteiroTopo ==-1);
    }
    @Override
    public Boolean estaCheia(){
        return(ponteiroTopo ==dados.length-1);// menos 1 pois de 0 a 9 tem 10 elementos mas o index final é 9 
    }
    @Override
    public String imprimir(){// retorna string para ser maleável
        String aux="[";
        for(int i=ponteiroTopo; i>=0; i--){
            aux+= dados[i]+ " ";
        }
        return aux + "]";
    }


    

}