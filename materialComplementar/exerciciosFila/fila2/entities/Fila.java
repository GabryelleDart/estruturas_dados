package fila.entities;

import fila.interf.Enfileiravel;

public class Fila implements Enfileiravel {
	private int ponteiroTopo;
	private int ponteiroFim;
	private Object[] valores;
	
	public Fila() {
		this(3);
	}
	
	public Fila(int tam) {
		ponteiroTopo = 0;
		ponteiroFim = -1;
		valores =new Object[tam];
	}

	@Override
	public void enfileirar(Object a) {
		if(!isFull()) {
			ponteiroFim++;
			valores[ponteiroFim]=a;
		}else {
			System.err.println("Fila cheia");
		}
		
	}

	@Override
	public Object espiar() {
	   Object aux=null;
		if(!isEmpty()) {
			aux= valores[ponteiroTopo];
		}else {
			System.err.println("Fila vazia ");
		}
		return aux;
	}

	@Override
	public Object desenfileirar() {
		Object aux=null;
		if(!isEmpty()) {
			aux=valores[ponteiroTopo];	
			ponteiroTopo++;
		}else {
			System.err.println("Fila vazia ");
		}
		return aux;
	}

	@Override
	public boolean isEmpty() {
		return(ponteiroTopo== ponteiroFim+1);
	}

	@Override
	public boolean isFull() {
		return(ponteiroFim==valores.length-1);
	}

	@Override
	public String imprimir() {
		String a="[";
			for(int i=ponteiroTopo;i<=ponteiroFim;i++) {
				if(i==ponteiroFim) {
					a+= valores[i];
				}else {
					a+= valores[i]+" ,";
				}
					}
			return a+"]";
	}

	@Override
	public void atualizarinicio(Object a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarfim(int a) {
		// TODO Auto-generated method stub
		
	}

	
			
}


