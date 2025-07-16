package entities;

public interface Arborizavel<T> {
// create - insere o elmento
	void inserir(T dado);
// read- função que retorna o no da raiz
	NoTriplo<T> getRaiz();
// update//
//delete
	T apagar(T dado);
	
	
	boolean existe(T dado);
	void limpar();
	
	String imprimirPreOrdem();
	String imprimirEmOrdem();
	String imprimirPosOrdem();
}
