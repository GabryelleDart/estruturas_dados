package pilhaduplinha;

import pil.DuplamenteEmpilhavel;

public class PilhaEstaticaDupla implements DuplamenteEmpilhavel{
	
	private int ponteiroTopo1;
	private int ponteiroTopo2;
	private String[]titulo;  //por que um array?
	
	//declaração de 2 funções extras a da implementação
	
	public PilhaEstaticaDupla( int tam) {
		ponteiroTopo1=-1;
		ponteiroTopo2=tam;
		titulo= new String[tam];//declaração da amplitude do array
	}
	public PilhaEstaticaDupla() {
		this(10);
	}
	@Override
	public void push1(String nome) {
		if(!isFull1()) {
			ponteiroTopo1++;
			titulo[ponteiroTopo1]=nome;
		}else {
			System.err.println(" Pilha cheia");
		}
		
	}

	@Override
	public String top1() {
		String aux=null;
		if(!isEmpty1()) {
			aux= titulo[ponteiroTopo1];
			
		}else {
			System.err.println("Pilha vazia");
		}
		return aux;
	}

	@Override
	public String pop1() {
		String aux=null;
		if(!isEmpty1()) {
			aux= titulo[ponteiroTopo1];
			ponteiroTopo1--;
			
		}else {
			System.err.println("Pilha vazia");
		}
		return aux;
	}

	@Override
	public void atualizar1(String nome) {
		if(!isEmpty1()) {
			titulo[ponteiroTopo1]=nome;
		}else {
			System.err.println("Pilha vazia");
		}
		
	}

	@Override
	public boolean isEmpty1() {
		if(ponteiroTopo1==-1) {//ou return (ponteiroTopo ==-1);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean isFull1() {
		if(ponteiroTopo2-ponteiroTopo1==1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String imprimir1() {
		String resul="[\n";
		for(int i=0;i<=ponteiroTopo1;i++) {
			if(i==ponteiroTopo1) {
				resul+=(i+1)+"° lugar: Livro: "+titulo[i]+"\n";
			}else {
				resul+=(i+1)+"° lugar: Livro: "+titulo[i]+"\n";
			}	
		}
		return resul;
	}

	@Override
	public void push2(String nome) {
		if(!isFull2()) {
			ponteiroTopo2--;
			titulo[ponteiroTopo2]=nome;
		}else {
			System.err.println(" Pilha cheia");
		}
		
	}

	@Override
	public String top2() {
		String aux=null;
		if(!isEmpty2()) {
			aux= titulo[ponteiroTopo2];
			
		}else {
			System.err.println("Pilha vazia");
		}
		return aux;
	}

	@Override
	public String pop2() {
		String aux=null;
		if(!isEmpty2()) {
			aux= titulo[ponteiroTopo2];
			ponteiroTopo2++;
			
		}else {
			System.err.println("Pilha vazia");
		}
		return aux;
	}

	@Override
	public void atualizar2(String nome) {
		if(!isEmpty2()) {
			titulo[ponteiroTopo2]=nome;
		}else {
			System.err.println("Pilha vazia");
		}
		
	}

	@Override
	public boolean isEmpty2() {
		if(ponteiroTopo2==titulo.length) {//ou return (ponteiroTopo ==-1);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean isFull2() {
		return isFull1();
	}

	@Override
	public String imprimir2() {
		String resul="[\n";
		for(int i=ponteiroTopo2;i<titulo.length;i++) {
			if(i==titulo.length-1) {
				resul+=(i+1)+"° lugar: Livro: "+titulo[i]+"\n";
			}else {
				resul+=(i+1)+"° lugar: Livro: "+titulo[i]+"\n";
			}	
		}
		return resul;
	}

}
