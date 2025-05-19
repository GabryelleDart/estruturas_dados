package questao3;

public interface Empillhavel {
	void push (String a);
	String top();
	String pop();
	
	boolean isEmpty();
	boolean isFull();
	String imprimir();
	String imprimirInvertido();

}
