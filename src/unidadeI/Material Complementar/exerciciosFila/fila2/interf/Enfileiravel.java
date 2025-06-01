package fila.interf;

public interface Enfileiravel {
	void enfileirar(Object a);  //c   enqueue
	Object espiar();            //r
	Object desenfileirar();            //d  dequeue
	
	
	void atualizarinicio(Object a);//u
	void atualizarfim(int a);//u
	//auxiliares
	boolean isEmpty();
	boolean isFull();
	String imprimir();
	
}
