package entities;

import java.util.NoSuchElementException;

public class PilhaDinamica<T extends String> implements Empilhavel<T > {
	private int quantidade;
	private int tamanhomax;
	private NoDuplo ponteiroTopo;
	
	public PilhaDinamica() {
		this(100);
	}

	public PilhaDinamica(int tamanhomax) {
		quantidade=0;
		this.tamanhomax = tamanhomax;
		ponteiroTopo= null;
	}

	@Override
	public void push(T dado) {
		if(isFull()) {
			throw new NoSuchElementException("Lista Cheia");
		}
		NoDuplo noTemp=new NoDuplo();
		noTemp.setDado(dado);
		noTemp.setNoAnterior(ponteiroTopo);
		if(!isEmpty()) {
			ponteiroTopo.setNoPosterior(noTemp);
		}
		ponteiroTopo=noTemp;
		quantidade++;
	}

	@Override
	public T top() {
		if(isEmpty()) {
			throw new NoSuchElementException("Lista Vazia");
		}
		
		return (T)ponteiroTopo.getDado();
	}

	@Override
	public T pop() {
		if(isEmpty()) {
			throw new NoSuchElementException("Lista Vazia");
		}
		T resposta=(T) ponteiroTopo.getDado();
		ponteiroTopo=ponteiroTopo.getNoAnterior();
		quantidade--;
		if(!isEmpty()) {
			//desvincular o ponteiroTop atual de apontar para o ponteiroTopo que nem extiste mais
			ponteiroTopo.setNoPosterior(null);
		}
		
		return resposta;
	
	}

	@Override
	public void update(T dado) {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new NoSuchElementException("Lista Vazia");
		}
		ponteiroTopo.setDado(dado);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return quantidade==0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return quantidade==tamanhomax;
	}

	@Override
	public String imprimir() {
		String aux="[";
		NoDuplo notemp=new NoDuplo();
		notemp=ponteiroTopo;
		for(int i=0;i<quantidade;i++) {
			aux+=notemp.getDado()+",";
			if(i==quantidade-1) {
				aux+=notemp.getDado()+"]";
			}
			notemp=notemp.getNoAnterior();
		}
		return aux;
	}
	public String imprimirFrenteTras() {
		String aux="[";
		NoDuplo notemp=new NoDuplo();
		notemp=ponteiroTopo;
		while(notemp.getNoAnterior()!=null) {
			notemp=notemp.getNoAnterior();
		}
		
		for(int i=0;i<quantidade;i++) {
			aux+=notemp.getDado()+",";
			if(i==quantidade-1) {
				aux+=notemp.getDado()+"]";
			}
			notemp=notemp.getNoPosterior();
		}
		return aux;
	}
	

}