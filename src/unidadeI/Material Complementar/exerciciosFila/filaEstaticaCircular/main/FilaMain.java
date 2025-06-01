package fila.main;

import fila.entities.FilaCircular;

public class FilaMain {

	public static void main(String[] args) {
		FilaCircular fc=new FilaCircular();
		fc.enfileirar("gaby");
		fc.enfileirar("e");
		fc.enfileirar("claudio");
		fc.enfileirar("se");
		fc.enfileirar("amam");
		System.out.println(fc.espiar());
		System.out.println(fc.isFull());
		fc.desenfileirar();
		System.out.println(fc.imprimir());
		
	}}


