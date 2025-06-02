package entities;

import java.util.NoSuchElementException;

import exception.OverflowException;
import intef.Listavel;

public class ListaDinamicaDuplamenteEncadeada implements Listavel {
	private NoDuplo ponteiroInicio;
	private NoDuplo ponteiroFim;
	private int quantidade;
	private int tamanho;
	
	
	public ListaDinamicaDuplamenteEncadeada () {
		this(100);
	}

	public ListaDinamicaDuplamenteEncadeada (int tamanho) {
		ponteiroInicio = null;
		ponteiroFim = null;
		quantidade = 0;
		this.tamanho = tamanho;
	}

	@Override
	public void anexar(Object dado) {
		if(isFull()) {
			throw new IllegalStateException("Lista Cheia");
		}else {
			NoDuplo noTemp= new NoDuplo(dado);
			if(!isEmpty()) {
				noTemp.setAnterior(ponteiroFim);
				ponteiroFim.setPosterior(noTemp);
			}else {
	
				ponteiroInicio=noTemp;
			}
			ponteiroFim=noTemp;
			quantidade++;
			
		}
		
	}

	@Override
	public void inserir (int posição, Object dado) {
		if(isFull()) {
			throw new OverflowException("Lista Cheia");
		}
		if(!(posição>=0 && posição<quantidade)) {
			throw new IndexOutOfBoundsException("Indice Inválido");
		}
		NoDuplo noAux=new NoDuplo(dado);
		
		NoDuplo noAnterior=null;
		NoDuplo noPosterior=ponteiroInicio;
		
		for(int i =0; i<posição;i++) {
			noAnterior=noPosterior;
			noPosterior=noPosterior.getPosterior();
		}
		
		if(noAnterior!=null) {
			 noAnterior.setPosterior(noAux);
		}else {
			 ponteiroInicio=noAux;
		}
		 
		if(noPosterior!=null) {
			 noPosterior.setAnterior(noAux);
		}else {
			 ponteiroFim=noAux;
		}
		noAux.setAnterior(noAnterior);
		noAux.setPosterior(noPosterior);
		quantidade++;
		
		
	}

	@Override
	public Object selecionar(int posição) {
		if(isEmpty()) {
			throw new NoSuchElementException("Lista Vazia");
		}
		if(!(posição>=0 && posição<quantidade)) {
			throw new IndexOutOfBoundsException("Indice Inválido");
		}
		NoDuplo noAux=ponteiroInicio;
		for(int i =0; i<posição;i++) {
			noAux=noAux.getPosterior();
		}
		return noAux.getDado();
	}
	

	@Override
	public Object[] selecionarTodos() {
		if(isEmpty()) {
			throw new NoSuchElementException("Lista Vazia");
		}
			Object[] list= new Object [quantidade];
			NoDuplo noaux=ponteiroInicio;
			for(int i=0;i<quantidade;i++) {
				list[i]=noaux.getDado();
				noaux=noaux.getPosterior();
				
			}
		return list;
		
		
		
	}

	@Override
	public void atualizar(int posição, Object dado) {
		if(isEmpty()) {
			throw new NoSuchElementException("Lista Vazia");
		}
		if(!(posição>=0 && posição<quantidade)) {
			throw new IndexOutOfBoundsException("Indice Inválido");
		}
		NoDuplo noAux=ponteiroInicio;
		for(int i =0; i<posição;i++) {
			noAux=noAux.getPosterior();
		}
		noAux.setDado(dado);
	}

	@Override
	public Object apagar(int posição) {
		if(isEmpty()) {
			throw new NoSuchElementException("Lista Vazia");
		}
		if(!(posição>=0 && posição<quantidade)) {
			throw new IndexOutOfBoundsException("Indice Inválido");
		}
		NoDuplo noAux=ponteiroInicio;
		for(int i =0; i<posição;i++) {
			noAux=noAux.getPosterior();
		}
		NoDuplo auxAnterior=noAux.getAnterior();
		NoDuplo auxPosterior=noAux.getPosterior();
		
		 if(auxAnterior!=null) {
			 auxAnterior.setPosterior(auxPosterior);
		 }else {
			 ponteiroInicio=ponteiroInicio.getPosterior();
		 }
		 
		 if(auxPosterior!=null) {
			 auxPosterior.setAnterior(auxAnterior);
		 }else {
			 ponteiroFim=ponteiroFim.getAnterior();
		 }
		quantidade--;
		return noAux.getDado();
	}
	

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (quantidade==tamanho);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (quantidade==0);
	}

	@Override
	public String imprimir() {
		String aux="[";
		NoDuplo noaux=ponteiroInicio;
		for(int i=0;i<quantidade;i++) {
			if(i!=quantidade-1) {
				aux+=noaux.getDado()+",";
			}else {
				aux+=noaux.getDado()+"]";
			}
			noaux=noaux.getPosterior();
		}
		return aux;
	}

	@Override
	public String imprimirTrasFrente() {
		String aux="[";
		NoDuplo noaux=ponteiroFim;
		for(int i=quantidade;i>0;i--) {
			if(i!=1) {
				aux+=noaux.getDado()+",";
			}else {
				aux+=noaux.getDado()+"]";
			}
			noaux=noaux.getAnterior();
		}
		return aux;
	}

}
