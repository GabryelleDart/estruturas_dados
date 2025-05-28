package unidadeII.códigos.aula19I05;

public class ListaDinamicaGenerica<T> implements Listavel<T> {
	//mantem os mesmo atributos da fila dinamica generica
	private NoDuplo<T> ponteiroInicio;
	private NoDuplo<T> ponteiroFim;
	private int quantidade;
	private int tamanho;
	
	

	public ListaDinamicaGenerica(int tamanho) {
	
		this.tamanho = tamanho;
	}
	public ListaDinamicaGenerica() {
		this(10);
	}
//mesma coisa da implementação do estaCheia estaVazia Imprimir da fila dinamica
	
	//esse tem um código de documentação - ver no github do professor(estudar documentação)
	@Override
	public void anexar(T dado) {
		if(estaCheia) {
			throw new OverflowException("Lista Cheia");
		}
		NoDuplo<T> noTemp=new NoDuplo<>(dado);
		noTemp.setAnterior(ponteiroFim);
		//Fazer a hipotese dele estar vazio
		ponteiroFim.setPosterior(noTemp);
		ponteiroFim=noTemp; //ou ponteiroFim=ponteirofim.getPosterior()
		quantidade++;
	}
	@Override
	public void atualizar(int posição, T dado) {
		if(estaVazia()) {
			//lança a exceção
		}
		if(!(posição>=0 && posição<quantidade)) {
			//lança a exceção
		}
	}

	@Override
	public void inserir(int posição, T dado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T selecionar(int posição) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T[] selecionarTodos(int posição) {
		T[] aux= new ;
		return null;
	}

}
