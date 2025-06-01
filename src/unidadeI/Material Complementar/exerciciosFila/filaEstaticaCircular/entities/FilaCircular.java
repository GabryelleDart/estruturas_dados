package fila.entities;

import fila.interf.Enfileiravel;

public class FilaCircular implements Enfileiravel {
	private int ponteiroInicio;
	private int ponteiroFim;
	private int quantidade;
	private Object[] valores;
	
	public FilaCircular() {
		this(5);
	}
	
	public FilaCircular(int tam) {
		
		ponteiroInicio = 0;
		ponteiroFim =-1;
		quantidade = 0;
		valores = new Object[tam];
	}
	@Override
	public void enfileirar(Object a) {
		if(!isFull()) {
			ponteiroFim=(ponteiroFim+1)%valores.length;
			valores[ponteiroFim]=a;
			quantidade++;
		}else {
			System.err.println("Fila cheia");
		}
		
	}
	@Override
	public Object espiar() {
		Object aux=null;
		if(!isEmpty()) {
			aux=valores[ponteiroInicio];
		}else {
				System.err.println("Fila vazia");
		}
		return aux;
	}
	@Override
	public Object desenfileirar() {
		Object aux=null;
		if(!isEmpty()) {
			aux=valores[ponteiroInicio];
			ponteiroInicio=(ponteiroInicio+1)%valores.length;
			quantidade--;
		}else {
			System.err.println("Fila vazia");
		}
		return aux;
	}
	@Override
	public boolean isEmpty() {
		return(quantidade==0);
	}
	@Override
	public boolean isFull() {
		return(quantidade==valores.length);
	}
	@Override
	public String imprimir() {
		String aux="[";
		for(int i=0;i<valores.length;i++) {
			if(i==ponteiroFim) {
				aux+= valores[ponteiroInicio];
			}else {
				aux+= valores[ponteiroInicio]+" ,";
			}
			ponteiroInicio=(ponteiroInicio+1)%valores.length;
		}
		return aux +"]";
	}
	public void atualizarFim(Object a) {
		if(!isEmpty()) {
			valores[ponteiroFim]=a;
		}else {
			System.err.println("Fila vazia");
		}
	}
	
	public void atualizarInicio(Object a) {
		if(!isEmpty()) {
			valores[ponteiroInicio]=a;
		}else {
			System.err.println("Fila vazia");
		}
	}
			
}


