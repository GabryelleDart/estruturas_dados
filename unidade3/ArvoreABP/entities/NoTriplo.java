package entities;
//esse no tem 3 ponteiros- um apontadno para o genitor , o filho esquerdo e o filho direito
public class NoTriplo<T> {
	private T dado;
	private NoTriplo<T> genitor;
	private NoTriplo<T> filhoesquerdo;
	private NoTriplo<T> filhodireito;
	
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	public NoTriplo<T> getGenitor() {
		return genitor;
	}
	public void setGenitor(NoTriplo<T> genitor) {
		this.genitor = genitor;
	}
	public NoTriplo<T> getFilhoesquerdo() {
		return filhoesquerdo;
	}
	public void setFilhoesquerdo(NoTriplo<T> filhoesquerdo) {
		this.filhoesquerdo = filhoesquerdo;
	}
	public NoTriplo<T> getFilhodireito() {
		return filhodireito;
	}
	public void setFilhodireito(NoTriplo<T> filhodireito) {
		this.filhodireito = filhodireito;
	}
	
	
}
