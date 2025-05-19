package pd.interf;
//interface é a mesma da pilha estatica
public interface Empilhavel {
	void push(Object dado);
	Object top();
	Object pop();
	boolean isEmpty();
	boolean isFull();
	String imprimir();
	

}
