package fila.interf;

public interface Enfileiravel {
	void enfileirarinicio(Object a);  //c   enqueue
	void enfileirarfim(Object a);
	Object espiarinicio();            //r
	Object espiarfim();   
	Object desenfileirarinicio();            //d  dequeue
	Object desenfileirarfim();
	
	
	//auxiliares
	boolean isEmpty();
	boolean isFull();
	String imprimir();
	String imprimirTrasFrente();
	void atualizarInicio(Object a);
	void atualizarFim(Object a);
}
