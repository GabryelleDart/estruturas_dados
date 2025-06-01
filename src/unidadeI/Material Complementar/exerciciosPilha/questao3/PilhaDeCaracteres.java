package questao3;


public class PilhaDeCaracteres implements Empillhavel {
	
	private String[]letras;
	private int ponteiroTopo;
	
	public PilhaDeCaracteres(String frase) {
		this.letras=frase.split(" ");
		ponteiroTopo = letras.length-1;
	}
	public PilhaDeCaracteres(int tamanho) {
		letras = new String[tamanho];
		ponteiroTopo = -1;
	}

	@Override
	public void push(String a) {
		if(!isFull()) {
			ponteiroTopo++;
			letras[ponteiroTopo]=a;
			
		}else {
			System.err.println("Pilha cheia");
		}
		
	}

	@Override
	public String top() {
		String aux=null;
		if(!isEmpty()) {
			aux=letras[ponteiroTopo];
		}else {
			System.err.println("Pilha vazia");
		}
		return aux;
	}

	@Override
	public String pop() {
		String aux=null;
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
		return(ponteiroTopo==-1);
	}

	@Override
	public boolean isFull() {
		return(ponteiroTopo==letras.length-1);
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String imprimirInvertido() {
		String aux="[";
		for(String a:letras) {
			char[] caractere=a.toCharArray();
				int tam=caractere.length-1;
				for(int i=0;i<caractere.length/2;i++) {
					char aj=caractere[i];
					caractere[i]=caractere[tam];
					caractere[tam]=aj;
					
					tam--;
				}
				a=new String(caractere);
				aux+=a+" ";
			
		}
		return aux+"]";
	}
	
	public String imprimirInvertidoOrdemCerta() {
		String aux="[";
		for(int j=ponteiroTopo;j>=0;j--) {
			char[] caractere=letras[j].toCharArray();
				int tam=caractere.length-1;
				for(int i=0;i<caractere.length/2;i++) {
					char aj=caractere[i];
					caractere[i]=caractere[tam];
					caractere[tam]=aj;
					
					tam--;
				}
				letras[j]=new String(caractere);
				aux+=letras[j]+" ";
			
		}
		return aux+"]";
	}

}
