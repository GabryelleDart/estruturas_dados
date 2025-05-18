package fila.entities;

import fila.interf.Enfileiravel;

public class FilaCircularDupla implements Enfileiravel {
	private int ponteiroInicio;
	private int ponteiroFim;
	private int quantidade;
	private Object[] valores;
	
	public FilaCircularDupla() {
		this(5);
	}
	
	public FilaCircularDupla(int tam) {
		
		ponteiroInicio = 0;
		ponteiroFim =-1;
		quantidade = 0;
		valores = new Object[tam];
	}

	@Override
	public void enfileirarinicio(Object a) {
		if(	!isFull()) {
			ponteiroInicio=(ponteiroInicio-1+valores.length)%valores.length;
			valores[ponteiroInicio]=a;
			quantidade++;
			
		}else {
			System.err.println("Fila cheia");
		}
		
	}

	@Override
	public void enfileirarfim(Object a) {
		if(!isFull()) {
			ponteiroFim=(ponteiroFim+1)%valores.length;
			valores[ponteiroFim]=a;
			quantidade++;
		}else {
			System.err.println("Fila cheia");
		}
		
	}

	@Override
	public Object espiarinicio() {
		Object aux=null;
		if(!isEmpty()) {
			aux=valores[ponteiroInicio];
			
		}else {
			System.err.println("Fila vazia");
		}
		return aux;
	}

	@Override
	public Object espiarfim() {
		Object aux=null;
		if(!isEmpty()) {
			aux=valores[ponteiroFim];
			
		}else {
			System.err.println("Fila vazia");
		}
		return aux;
	}

	@Override
	public Object desenfileirarinicio() {
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
	public Object desenfileirarfim() {
		Object aux=null;
		if(!isEmpty()) {
			aux=valores[ponteiroFim];
			ponteiroFim=(ponteiroFim-1+valores.length)%valores.length;
			quantidade--;
		}else {
			System.err.println("Fila vazia");
		}
		return aux;
	}

	@Override
	public boolean isEmpty() {
		return (quantidade==0);
	}

	@Override
	public boolean isFull() {
		return (quantidade==valores.length);
	}

	@Override
	public String imprimir() {
		String retorno = "[";
		int ponteiroAux = ponteiroInicio;
		for (int i = 0; i < quantidade; i++) {			
			retorno +=valores[ponteiroAux];
			if (i != quantidade - 1) 
				retorno += ",";
			
			ponteiroAux = (ponteiroAux+1)%valores.length; 
		}
		return retorno + "]";		
	}

	@Override
	public String imprimirTrasFrente() {
		String retorno = "[";
		int ponteiroAux = ponteiroFim;
		for (int i = 0; i < quantidade; i++) {			
			retorno +=valores[ponteiroAux];
			if (i != quantidade - 1) 
				retorno += ",";
			
			ponteiroAux = (ponteiroAux-1+valores.length)%valores.length; 
		}
		return retorno + "]";	
	}

	public void atualizarInicio(Object a) {
		if(!isEmpty()) {
			valores[ponteiroInicio]=a;
		}else {
			System.err.println("Fila vazia");
		}
		
	}

	public void atualizarFim(Object a) {
		if(!isEmpty()) {
			valores[ponteiroFim]=a;
		}else {
			System.err.println("Fila vazia");
		}
	}
	
			
}


