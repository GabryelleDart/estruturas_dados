package fila.interf;

public interface Enfileiravel {
	void inserir(int a);  //c   enqueue
	Integer frente();            //r
	Integer remover();            //d  dequeue
	void atualizarinicio(int a);//u
	void atualizarfim(int a);//u
	//auxiliares
	boolean isEmpty();
	boolean isFull();
	String imprimir();
	
}
