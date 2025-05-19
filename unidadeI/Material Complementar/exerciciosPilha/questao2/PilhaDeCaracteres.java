package questao2;

public class PilhaDeCaracteres implements Empillhavel {
	
	private char[]letras;
	private int ponteiroTopo;
	
	
	public PilhaDeCaracteres(int tamanho) {
		letras = new char[tamanho];
		ponteiroTopo = 0;
	}

	@Override
	public void push(char a) {
		if(!isFull()) {
			ponteiroTopo++;
			letras[ponteiroTopo]=a;
			
		}else {
			System.err.println("Pilha cheia");
		}
		
	}

	@Override
	public char top() {
		Character aux=null;
		if(!isEmpty()) {
			aux=letras[ponteiroTopo];
		}else {
			System.err.println("Pilha vazia");
		}
		return aux;
	}

	@Override
	public char pop() {
		Character aux=null;
		if(!isEmpty()) {
			aux=letras[ponteiroTopo];
			ponteiroTopo--;
		}else {
			System.err.println("Pilha vazia");
		}
		return aux;
	}

	@Override
	public boolean isEmpty() {
		return(ponteiroTopo==0);
	}

	@Override
	public boolean isFull() {
		return(ponteiroTopo==letras.length);
	}

}
