package pilha.interfac;

public interface Empilhavel {
	//essenciais
	void push(String nome);  //c
	String top();            //r
	String pop();            //d
	void atualizar(String nome);//u
	//auxiliares
	boolean isEmpty();
	boolean isFull();
	String imprimir();
	
	

}
