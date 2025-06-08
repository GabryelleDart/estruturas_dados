public interface Listavel {
    void anexar(Object dado);//final da lista
	void inserir(int posição,Object dado);
	
	Object selecionar(int posição);
	Object[] selecionarTodos();
	
	void atualizar(int posição,Object dado);
	
	Object apagar(int posição);
	
	boolean isFull();
	boolean isEmpty();
	String imprimir();
	String imprimirTrasFrente();
}
