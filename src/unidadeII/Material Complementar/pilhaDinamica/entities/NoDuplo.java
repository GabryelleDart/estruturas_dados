package pd.entities;

public class NoDuplo {
	private NoDuplo anterior; //necessario ter os ponteiro agora - cada nó terá ponteiro para o anterior e o próximo
	
	private Object dado;
	private NoDuplo posterior;
	
	public NoDuplo() {
		
	}
	public NoDuplo(Object dado) {
		this.dado = dado;
	}
	public NoDuplo getAnterior() {
		return anterior;
	}
	public void setAnterior(NoDuplo anterior) {
		this.anterior = anterior;
	}
	public Object getDado() {
		return dado;
	}
	public void setDado(Object dado) {
		this.dado = dado;
	}
	public NoDuplo getPosterior() {
		return posterior;
	}
	public void setPosterior(NoDuplo posterior) {
		this.posterior = posterior;
	}
	
	
	

}
