package pilha.interf;

public class PilhaEstatica implements Empilhavel {
	private int ponteiroTopo;
	private int[] numeros= {1,2,3,4};
	
	public PilhaEstatica() {
		this.ponteiroTopo=3;
	}
	@Override
	public void push(int a) {
		if(!isFull()) {
			ponteiroTopo++;
			numeros[ponteiroTopo]=a;
		}else {
			System.err.println("Pilha cheia");
		}
		
	}

	@Override
	public int top() {
		Integer aux=null;
		if(!isEmpty()){
			aux=numeros[ponteiroTopo];
			
		}else {
			System.err.println("Pilha vazia");
		}
		return aux;
	}

	@Override
	public void update(int a) {
		if(!isEmpty()){
			numeros[ponteiroTopo]=a;
			
		}else {
			System.err.println("Pilha vazia");
		}
		
	
	}

	@Override
	public int pop() {
		Integer aux=null;
		if(!isEmpty()){
			aux=numeros[ponteiroTopo];
			ponteiroTopo--;
		}else {
			System.err.println("Pilha vazia");
		}
		return aux;
	}

	@Override
	public boolean isFull() {
		return(ponteiroTopo==numeros.length-1);
	}

	@Override
	public boolean isEmpty() {
		return(ponteiroTopo==-1);
	}

	@Override
	public String imprimir() {
		String resul="[";
		if(!isEmpty()) {
		for(int i=0;i<=numeros.length-1;i++) {
			if(i==numeros.length-1) {
				resul+=numeros[i];
			}else {
				resul+=numeros[i]+",";
			}
		}}else {
			resul+="Pilha vazia";
		}
		return resul+"]";
	}

}
