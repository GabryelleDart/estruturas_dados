package application;

import pd.entities.PilhaDinamica;
import pd.interf.Empilhavel;

//mesma coisa da main da pilha estatica
public class Program {

	public static void main(String[] args) {
		Empilhavel pc=new PilhaDinamica();
		pc.push("Estruturas ");
		pc.push("de");
		pc.push("Dados");
		System.out.println(pc.imprimir());

	}

}
