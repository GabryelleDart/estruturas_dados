package application;

import java.util.Scanner;

import entities.PilhaDinamica;

public class Main {

	public static void main(String[] args) {
		// quando ha abertura preciso procurar o fechamento
		//no fechamento desempilha
		//se a pilha não for nula a expressao esta incorreta
		Scanner sc= new Scanner(System.in);
		System.out.println(" Insira a expressao para saber se é válida:");
		String expressao=sc.nextLine();
		if(ExpressaoValida(expressao)) {
			System.out.println("Expressao bem construída");
		}else {
			System.out.println("Expressao mal construída");
		}
		
		sc.close();
	
	}
	public static boolean ExpressaoValida(String exemplo) {
		boolean c=true;
		char[]elementos=exemplo.toCharArray();
		PilhaDinamica pd=new PilhaDinamica();
		for(int i=0;i<elementos.length;i++) {
			if(elementos[i]=='('||elementos[i]=='['||elementos[i]=='{') {
				pd.push(String.valueOf(elementos[i]));
			}else if(elementos[i]==')'||elementos[i]==']'||elementos[i]=='}') {
				if(pd.isEmpty()) {
					return false;
				}
				String topo=pd.pop();
				if((elementos[i]==')'&& !topo.equals("(")) ||
					(elementos[i]==']'&& !topo.equals("["))||
					(elementos[i]=='}'&& !topo.equals("{"))){
					//falhou pois é uma esxpressao como [(5x*]2)
					return false;
					
				}
			}
		}
		
		return pd.isEmpty();
	}
	

}

