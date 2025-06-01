package fila.main;

import fila.entities.Fila;

public class FilaMain {

	public static void main(String[] args) {
		Fila sd=new Fila();
		sd.inserir(0);
		sd.inserir(1);
		System.out.println(sd.frente());
		sd.remover();
		System.out.println(sd.frente());
		sd.inserir(2);
		sd.inserir(3);
		sd.inserir(4);
		while(true) {
			int x =sd.remover();
			System.out.println("Removi"+x);
		}
	}

}
