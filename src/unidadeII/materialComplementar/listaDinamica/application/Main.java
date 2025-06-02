package application;

import entities.ListaDinamicaDuplamenteEncadeada;
import exception.OverflowException;
import intef.Listavel;
public class Main {

	public static void main(String[] args) {
		Listavel list=new ListaDinamicaDuplamenteEncadeada(10);
		try{
			list.anexar("A orbita do Sol");
			list.inserir(0, "A materia de estruturas está n");
			System.out.println(list.imprimir());
			System.out.println(list.imprimirTrasFrente());
		}catch (IndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}catch (OverflowException a) {
			System.err.println(a.getMessage());
		}
	
	}

}
