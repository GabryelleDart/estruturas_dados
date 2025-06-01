package fila.interf;

public interface Enfileiravel {
	void enfileirar(Object a);  //c   enqueue
	Object espiar();            //r
	Object desenfileirar();            //d  dequeue
	
	
	
	//auxiliares
	boolean isEmpty();
	boolean isFull();
	String imprimir();
	
}
