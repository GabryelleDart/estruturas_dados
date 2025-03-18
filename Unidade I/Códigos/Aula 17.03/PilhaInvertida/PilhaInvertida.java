public class PilhaInvertida  implements Empilhavel{
    private Object[] dados; // tem que ser object pois as operaçoes sem Empilhavel sao sobre object
    private int ponteiroTopo;

    public PilhaInvertida() {
        dados = new Object[10];
        ponteiroTopo = dados.length;

    }
    @Override
     public void empilhar(Object a){
        if(!estaCheia()){
            ponteiroTopo --;
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
          
           ponteiroTopo++;
        }
            return aux; 
        }

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
        return(ponteiroTopo ==dados.length);
    }
    @Override
    public Boolean estaCheia(){
        return(ponteiroTopo == 0);
    }
    public String imprimir(){
        String aux="[";
        for(int i=ponteiroTopo; i<dados.length; i++){//não usa for each pois não iteraremos todos os dados apenas do topo para o tamanho
            aux+= dados[i]+ " ";
        }
        return aux + "]";
    }


    

}