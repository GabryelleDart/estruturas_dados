package pd.entities;

// import interf.Empilhavel; // Removed or update this line if Empilhavel is in a different package
import pd.entities.Empilhavel; // Use the correct package if Empilhavel is in 'pd.entities'
import pd.entities.NoDuplo; // Import NoDuplo if it is in the same package

public class PilhaDinamica  implements Empilhavel{
	private int tamanho;// esse seria um tamanho maximo da estrutura, não sera alocado - é o tam maximo
	private int quantidade;//quantos elementos se tem no exato momento
	private NoDuplo ponteiroTopo;//referencia para o topo da pilha, que é o ultimo elemento adicionado da pilha , agora a referencia sao nós 
	
	public PilhaDinamica() {
		this(100);//esse é o tamanho máximo
	}
	
	
	public PilhaDinamica(int tamanho) {
		this.tamanho = tamanho;
		quantidade=0;
		ponteiroTopo=null;
	}

	@Override
	public void push(Object dado) {
		if(!isFull()) {
			//cria nova regiao de memoria para alocar dados
			NoDuplo noTemporario=new NoDuplo();
			noTemporario.setDado(dado);
			noTemporario.setAnterior(ponteiroTopo);
			if(!isEmpty()) {
				ponteiroTopo.setPosterior(noTemporario);
			}
			ponteiroTopo=noTemporario;
			quantidade++;
			
		}else {
			System.err.println("Pilha cheia");
		}
		
	}

	@Override
	public Object top() {
		Object Aux=null;
		if(!isEmpty()) {
			Aux=ponteiroTopo.getDado();	
		}else {
			System.err.println("Pilha vazia");
		}
		return Aux;
	}

	@Override
	public Object pop() {
		Object Aux=null;
		if(!isEmpty()) {
			Aux=ponteiroTopo.getDado();
			ponteiroTopo=ponteiroTopo.getAnterior();
			if(quantidade>1) {
				ponteiroTopo.setPosterior(null);
			}
			quantidade--;
		}else {
			System.err.println("Pilha vazia");
		}
		return Aux;
	}

	@Override
	public boolean isEmpty() {
		
		return (quantidade==0);
	}

	@Override
	public boolean isFull() {
		return (quantidade==tamanho);
	}

	@Override
	public String imprimir() {
		NoDuplo ponteiroAux=ponteiroTopo;
		String resul="[";
		for(int i=quantidade-1;i>=0;i--) {
			if(i==0) {
				resul+=ponteiroAux.getDado();
			}else {
				resul+=ponteiroAux.getDado()+",";
			}
			ponteiroAux=ponteiroAux.getAnterior();
		}
		return resul+"]";
	}

}
