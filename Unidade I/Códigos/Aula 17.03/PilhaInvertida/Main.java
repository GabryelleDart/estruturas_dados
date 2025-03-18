package Unidade I.Códigos.Aula 17.03.PilhaInvertida;

public class Main {
    public static void main(String[] args) {
        PilhaInvertida p1 =new PilhaInvertida(30);// usando a classe
        /*Empilhavel p2 = new PilhaEstatica(30) ;// usando a interface -> mais indicada pois não da detalhes implementação
        // se eu usar a interface e houver um metodo inedito na interface eu já não posso usar 
        //  como por exemplo p2.ImpriirNaImpressora
        /*
         * ESXEMPLO DESSAS DUAS IMPLEMENTAÇÕES COM ARRAYLIST
         * List a = new Arraylist -> List é uma interface - 
         * Arraylist a =new Arraylist ->  é a classe concreta
         
        pilha.empilhar("Instituto");
		pilha.empilhar("Federal");
		System.out.println("Espiar:" + pilha.topo());		
		pilha.empilhar("de");
		pilha.empilhar("Educação");
		pilha.empilhar("Ciência");
		pilha.empilhar("e");		
		System.out.println("Espiar:" + pilha.topo());		
		Object conteudo = pilha.desempilhar();
		pilha.desempilhar();
		pilha.empilhar("Tecnologia");
		pilha.empilhar("da");
		pilha.empilhar("Bahia");	
		pilha.empilhar(pilha.desempilhar());
		pilha.empilhar(conteudo);
		System.out.println("Pilha="+pilha.imprimir());
        */
        
        p1.empilhar("Instituto");
		p1.empilhar("Federal");
		System.out.println("Espiar:" + p1.topo());
    }
}
    

