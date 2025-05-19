package pilha.interf;


public class PilhaMain {

	public static void main(String[] args) {
		Empilhavel empilhavel=new PilhaEstatica();
		System.out.println(empilhavel.imprimir());
		System.out.println(empilhavel.pop());
		System.out.println(empilhavel.pop());
		System.out.println(empilhavel.pop());
		empilhavel.push(4);
		System.out.println(empilhavel.pop());
		empilhavel.push(3);
		System.out.println(empilhavel.pop());
		System.out.println(empilhavel.pop());
		
	}

}
