package entities;

public class NoDuplo {
	private NoDuplo anterior;
	private NoDuplo posterior;
	private Object dado;
	
	public NoDuplo(Object dado) {
		this.dado = dado;
	}
	public NoDuplo() {
	
	}
	public NoDuplo getAnterior() {
		return anterior;
	}
	public void setAnterior(NoDuplo anterior) {
		this.anterior = anterior;
	}
	public NoDuplo getPosterior() {
		return posterior;
	}
	public void setPosterior(NoDuplo posterior) {
		this.posterior = posterior;
	}
	public Object getDado() {
		return dado;
	}
	public void setDado(Object dado) {
		this.dado = dado;
	}
	
	
	
}
