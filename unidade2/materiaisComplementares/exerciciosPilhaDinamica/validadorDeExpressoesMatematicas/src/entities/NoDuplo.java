package entities;

public class NoDuplo<T extends String> {
	private T dado;
	private NoDuplo noAnterior;
	private NoDuplo noPosterior;
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	public NoDuplo getNoAnterior() {
		return noAnterior;
	}
	public void setNoAnterior(NoDuplo noAnterior) {
		this.noAnterior = noAnterior;
	}
	public NoDuplo getNoPosterior() {
		return noPosterior;
	}
	public void setNoPosterior(NoDuplo noPosterior) {
		this.noPosterior = noPosterior;
	}
	
	
}
