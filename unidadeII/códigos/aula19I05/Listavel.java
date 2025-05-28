package unidadeII.códigos.aula19I05;
public interface Listavel<T> {
	void anexar(T dado);
	void inserir(int posição,T dado);
	T selecionar(int posição);
	T[] selecionarTodos(int posição);
	//...

}
