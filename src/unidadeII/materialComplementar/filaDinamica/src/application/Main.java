package application;

import entities.FilaDinamica;
import interf.Enfileiravel;

public class Main {
	  public static void main(String[] args) {
		  try {
	        Enfileiravel fila = new FilaDinamica(5);
	        fila.enfileirar("Primeiro");
	        fila.enfileirar("Segundo");
	        fila.enfileirar("Terceiro");
	        fila.enfileirar("Quarto");
	        fila.enfileirar("Quinto");
	        System.out.println(fila.espiar());
	        System.out.println(fila.isFull());
	        fila.enfileirar("Sexto");
	        }catch (IllegalStateException e) {
				System.err.println(e.getMessage());
			}
	    }
}
