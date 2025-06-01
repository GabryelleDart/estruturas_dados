package fila.main;

import fila.entities.Fila;

public class FilaMain {

	public static void main(String[] args) {
		Fila fila=new Fila();
		fila.enfileirar("Gaby");
		fila.enfileirar("e Claudio");
		System.out.println(fila.espiar());
		}
	}


