
public class FilacomPilhas implements Fila{
    private Empilhavel p1;

    public FilaComPilhas(){
        this(5);
    }
    public FilaComPilhas(int tamanho){
    p1=new PilhaEstatica(tamanho);
    p2= new PilhaEstatica(tamanho);
    
}