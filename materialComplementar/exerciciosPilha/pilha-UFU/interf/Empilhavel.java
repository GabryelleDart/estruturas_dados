package pilha.interf;

public interface Empilhavel {
 void push(int a); //c
 int top();  //r
 void update(int a); //u
 int pop();//d
 
 boolean isFull();
 boolean isEmpty();
 String imprimir();
 
}
