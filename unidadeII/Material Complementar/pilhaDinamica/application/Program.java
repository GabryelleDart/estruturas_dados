package application;

import pd.entities.PilhaDinamica;

//mesma coisa da main da pilha estatica
public class Program {

	public static void main(String[] args) {
		PilhaDinamica pc=new PilhaDinamica();
		pc.push("Estruturas ");
		pc.push("de");
		pc.push("Dados");
		System.out.println(pc.imprimir());

	}

}
