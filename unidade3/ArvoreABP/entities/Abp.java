package entities;

public class Abp<T extends Comparable<T>>implements Arborizavel<T>{
	// so declara a raiz da arvore 
	private NoTriplo<T>raiz;
	
	public Abp() {
		raiz=null;//inicia a raiz nula
	}

	@Override
	public void inserir(T dado) {
		//criar espaço
		NoTriplo<T> novoNo= new NoTriplo<T>();
		// colocar o dado no espaço
		novoNo.setDado(dado);
		// precisa verificar se a raiz está vazia
		if(raiz==null){
			raiz=novoNo;
		}else {
			//cria no auxiliar igual a raiz para aujudar a ir navegandio pela arvore ate achar o ponto de colocar o novo nó
			NoTriplo<T> auxiliar = raiz;
			// loop até achar o lugar perfeito para inserir - sairemos com break
			while(true) {
				int comparação=dado.compareTo(auxiliar.getDado());
				//MENOR OU IGAUL A 0 VAI PARA A ESQUERDA
				//MAIOR VAI PARA A DIREITA
				if(comparação<=0) {
					//necessario agora ver se a esuerda esta vazia ou preecnchida
					if(auxiliar.getFilhoesquerdo()==null) {
						//se tiver vazio- alinha o genitor para esse no e o no para o genitor
						auxiliar.setFilhoesquerdo(novoNo);
						novoNo.setGenitor(auxiliar);
						break;
					}
					//se ja tiver algo no nó a esquerda ,o no auxiliar passa para o proximo e continua o loop
					auxiliar=auxiliar.getFilhoesquerdo();
				}else {
					if(auxiliar.getFilhodireito()==null) {
						//se tiver vazio- alinha o genitor para esse no e o no para o genitor
						auxiliar.setFilhodireito(novoNo);
						novoNo.setGenitor(auxiliar);
						break;
					}
					//se ja tiver algo no nó a esquerda ,o no auxiliar passa para o proximo e continua o loop
					auxiliar=auxiliar.getFilhodireito();
				}
			}
		}
	}
	public void inserirRecursivo(T dado){
		if(raiz==null){
			raiz.setDado(dado);
		}else{
			inserirRecursivo(raiz,dado);
		}
	}
	private void inserirRecursivo(NoTriplo<T> atual,T dado) {
		//haverá 2 casos base e 2 elses recursivos visto que há a opçao de ser maior ou menor que a raiz
		if(dado.compareTo(atual.getDado())<=0){
		//esquerda
			if(atual.getFilhoesquerdo()==null){
				NoTriplo<T>novonodo=new NoTriplo<T>();
				novonodo.setDado(dado);
				novonodo.setGenitor(atual)
				atual.setFilhoesquerdo(novonodo);
			}else{
				inserirRecursivo(atual.getFilhoesquerdo(),dado);
			}
		}else{
		//direita
			if(atual.getFilhodireito()==null){
				NoTriplo<T>novonodo=new NoTriplo<T>();
				novonodo.setDado(dado);
				novonodo.setGenitor(atual)
				atual.setFilhodireito(novonodo);
			}else{
				inserirRecursivo(atual.getFilhodireito(),dado);
			}
		}
	}
	@Override
	public NoTriplo<T> getRaiz() {
		// TODO Auto-generated method stub
		return raiz;
	}

	@Override
	public T apagar(T dado) {
		NoTriplo<T>aux=buscar(dado);
		//se o nó com esse valor não existir
		if(aux==null) {
			return null;
		}
		//agora sao 3 casos - se ele for um nó filho/ folha
	    if(aux.getFilhodireito()==null&& aux.getFilhoesquerdo()==null) {
			apagaFolha(aux);
		}
		//se ele tiver um filho
		else if(aux.getFilhodireito()==null|| aux.getFilhoesquerdo()==null) {
			apagaCom1Filho(aux);
		}
		//se ele tiver 2 filhos
		else {
			apagaCom2Filho(aux);
		}
	    return dado;
	}
	public String exist(T dado){
		if(existRec)
	}
	public void apagaFolha(NoTriplo<T> auxiliar) {
		//pegar referencia para o pai
		NoTriplo<T> papai=auxiliar.getGenitor();
		//verificar se é uma raiz
		if(papai==null) {
			raiz=null;
		}else {
			//necessario saber quem iremos apagar- se é o filho da direita de papai ou da esquerda
			if(auxiliar==papai.getFilhodireito()) {// nesse caso pode usar == 
				papai.setFilhodireito(null);
			}else {
				papai.setFilhoesquerdo(null);
			}
		}
	}
	
	public void apagaCom1Filho(NoTriplo<T> auxiliar) {
		NoTriplo<T> filho;
		//pegar referencia para o pai
		NoTriplo<T> papai=auxiliar.getGenitor();
		//pegar referencia para o neto
		if(auxiliar.getFilhodireito()==null) {
			filho=auxiliar.getFilhoesquerdo();
		}else {
			filho=auxiliar.getFilhodireito();
		}
		//verificar se é uma raiz
		if(papai==null) {
			raiz=filho;
			raiz.setGenitor(null);
			}else {
				filho.setGenitor(papai);
			//necessario saber quem irá se ligar ao pai do elemento apagado- se é o filho da direita de papai ou da esquerda
				if(filho==auxiliar.getFilhodireito()) {// nesse caso pode usar == 
						papai.setFilhodireito(filho);
				}else {
						papai.setFilhoesquerdo(filho);
						
					}
			}	
	}
	public void apagaCom2Filho(NoTriplo<T> auxiliar) {
	//a tatica será substituir o no desejado de deleção pelo menor dasubarvore  direita ou maior da subarvore esquerda-> pq não vai ter erro na hora de alterar 
	NoTriplo<T> noSucessor = encontraMenorDireita(auxiliar);
	auxiliar.setDado(noSucessor.getDado());
	if(noSucessor.getFilhodireito()==null&&noSucessor.getFilhoesquerdo()==null) {
		apagaFolha(noSucessor);
	}else {
		// o apagar com um filho é para o caso dele ser o menor mas ter outro maior que ele ligado a ele
	apagaCom1Filho(noSucessor);
	}
	}
	public NoTriplo<T>encontraMenorDireita(NoTriplo<T> nodo){
		NoTriplo<T> noaux=nodo.getFilhodireito();
		while(noaux.getFilhoesquerdo()!=null) {
			noaux=noaux.getFilhoesquerdo();
		}
		return noaux;
	}
	public NoTriplo<T>encontraMaiorEsquerda(NoTriplo<T> nodo){
		NoTriplo<T> noaux=nodo.getFilhoesquerdo();
		while(noaux.getFilhodireito()!=null) {
			noaux=noaux.getFilhodireito();
		}
		return noaux;
	}
	@Override
	public boolean existe(T dado) {
		// TODO Auto-generated method stub
		return buscar(dado)!= null;
	}
	private NoTriplo<T> buscar(T dado){
		NoTriplo<T> noAux= raiz;
		while(noAux!=null) {
			int comparação=dado.compareTo(noAux.getDado());
			if(comparação>0) {
				noAux=noAux.getFilhodireito();
			}else if(comparação<0) {
				noAux=noAux.getFilhoesquerdo();
			}else {
				return noAux;
			}
		}return null;
	}

	@Override
	public void limpar() {
		raiz=null;
		
	}

	@Override
	public String imprimirPreOrdem() {
		return formataSaída(imprimirPreOrdemRec(raiz));
	}
	private String imprimirPreOrdemRec(NoTriplo<T>raizA) {
		if(raizA==null) {
			return " ";
		}else {
			return raizA.getDado()+" "+imprimirPreOrdemRec(raizA.getFilhoesquerdo())+ " "+ imprimirPreOrdemRec(raizA.getFilhodireito());
		}
		
	}

	@Override
	public String imprimirEmOrdem() {
		// TODO Auto-generated method stub
		return formataSaída(imprimirEmOrdemRec(raiz));
	}
	private String imprimirEmOrdemRec(NoTriplo<T>raizA) {
		if(raizA==null) {
			return " ";
		}else {
			return imprimirEmOrdemRec(raizA.getFilhoesquerdo())+" "+raizA.getDado()+ " "+ imprimirEmOrdemRec(raizA.getFilhodireito());
		}
		
	}
	@Override
	public String imprimirPosOrdem() {
		// TODO Auto-generated method stub
		return formataSaída(imprimirPosOrdemRec(raiz));
	}
	private String imprimirPosOrdemRec(NoTriplo<T>raizA) {
		if(raizA==null) {
			return " ";
		}else {
			return imprimirPosOrdemRec(raizA.getFilhodireito())+ " "+ imprimirPosOrdemRec(raizA.getFilhoesquerdo())+" "+raizA.getDado();
		}
		
	}
	private String formataSaída(String msg) {
		String resultado;
		resultado=msg;
		resultado=resultado.trim();
		resultado=resultado.replace(" ", ",");
		return "["+resultado+"]";
	}
}
