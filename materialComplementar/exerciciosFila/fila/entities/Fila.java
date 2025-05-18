package fila.entities;

import fila.interf.Enfileiravel;

public class Fila implements Enfileiravel {
	private int ponteiroTopo;
	private int ponteiroFim;
	private int total;
	private int[] valores;
	
	public Fila() {
		this(3);
	}
	
	public Fila(int tam) {
		ponteiroTopo = 0;
		ponteiroFim = 0;
		total =0;
		this.valores =new int[tam];
	}

	@Override
	public void inserir(int a) {
		if(!isFull()) {
			valores[ponteiroFim]=a;
			ponteiroFim=(ponteiroFim+1)%valores.length;
			total++;
			
		}
		
	}

	@Override
	public Integer frente() {
	   Integer aux=null;
		if(!isEmpty()) {
			aux= valores[ponteiroTopo];
		}
		return aux;
	}

	@Override
	public Integer remover() {
		Integer aux=null;
		if(!isEmpty()) {
			aux= valores[ponteiroTopo];
			ponteiroTopo=(ponteiroTopo+1)%valores.length;;
			total--;
		}
		return aux;
	}

	@Override
	public boolean isEmpty() {
		return(total==0);
	}

	@Override
	public boolean isFull() {
		return(total==valores.length);
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarinicio(int a) {
		if(!isEmpty()) {
			valores[ponteiroTopo]=a;
		}
			
}
	@Override
	public void atualizarfim(int a) {
		if(!isEmpty()) {
			valores[ponteiroFim]=a;
		}
			
}

}
