package pilha.clas;

import pilha.interfac.Empilhavel;

public class PilhaEstática implements Empilhavel{

	private int ponteiroTopo;
	private String[]titulo;  //por que um array?
	
	//declaração de 2 funções extras a da implementação
	
	public PilhaEstática( int tam) {
		
		ponteiroTopo=tam;
		titulo= new String[tam];//declaração da amplitude do array
	}
	
	
	public PilhaEstática() {
		this(10);
	}


	@Override
	public void push(String nome) {
		if(!isFull()) {
			ponteiroTopo--;
			titulo[ponteiroTopo]=nome;
		}else {
			System.err.println(" Pilha cheia");
		}
		
	}



	@Override
	public String top() {
		String aux=null;
		if(!isEmpty()) {
			aux= titulo[ponteiroTopo];
			
		}else {
			System.err.println("Pilha vazia");
		}
		return aux;
	}
		

	@Override
	public String pop() {
		String aux=null;
		if(!isEmpty()) {
			aux= titulo[ponteiroTopo];
			ponteiroTopo++;
			
		}else {
			System.err.println("Pilha vazia");
		}
		return aux;
	}

	@Override
	public void atualizar(String nome) {
		/*pop();
		push(nome);*/
		if(!isEmpty()) {
			titulo[ponteiroTopo]=nome;
		}else {
			System.err.println("Pilha vazia");
		}
	}

	@Override
	public boolean isEmpty() {
		if(ponteiroTopo==titulo.length) {//ou return (ponteiroTopo ==-1);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean isFull() {
		if(ponteiroTopo==0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String imprimir() {
		String resul="[\n";
		for(int i=ponteiroTopo;i<titulo.length;i++) {
			if(i==titulo.length-1) {
				resul+=(i+1)+"° lugar: Livro: "+titulo[i]+"\n";
			}else {
				resul+=(i+1)+"° lugar: Livro: "+titulo[i]+"\n";
			}	
		}
		return resul;
	}

}
