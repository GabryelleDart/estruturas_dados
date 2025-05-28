package unidadeII.códigos.aula19I05;
public class NoDuplo<T> {
	private NoDuplo<T> anterior;
	private T dado;
	private NoDuplo<T> posterior;
	
	public NoDuplo(T dado) {
	
		this.dado = dado;
	}
	public NoDuplo<T> getAnterior() {
		return anterior;
	}
	public void setAnterior(NoDuplo<T> anterior) {
		this.anterior = anterior;
	}
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	public NoDuplo<T> getPosterior() {
		return posterior;
	}
	public void setPosterior(NoDuplo<T> posterior) {
		this.posterior = posterior;
	}
	
	
	

}
