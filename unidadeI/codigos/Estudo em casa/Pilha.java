
public class Pilha {
    //pilha estaticas formada por vetor de números inteiros
   public  int inteiros[];
   public  int topo;

    public Pilha() {
        inteiros = new int[5];// declara o vetor com tamanho estatico
        topo=-1;// valor inválido que irá auxiliar na verificação de esta vazia
    }
    public void push(int a){
        topo ++;
        inteiros[topo]=a;
    }
    public int pop(){
        int a= inteiros[topo];
        topo --;
        return a;
    }
    public boolean isEmpty(){
        return(topo ==-1);
    }
    public boolean isFull(){
        return(topo ==inteiros.length);
    }
    public int top(){
        return inteiros[topo];
    }
}
