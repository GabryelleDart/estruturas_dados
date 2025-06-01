package pilha.clas;

import java.util.Scanner;

public class PilhaMain {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	PilhaEstática p= new PilhaEstática(3);
	System.out.println("Top filmes lidos.\nInsira os seus favoritos em ordem decrescente:");
	p.push(sc.nextLine());
	p.push(sc.nextLine());
	p.push(sc.nextLine());
	p.atualizar(sc.nextLine());
	System.out.println(p.imprimir());
	}

}
