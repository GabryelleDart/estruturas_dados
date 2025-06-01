package fila.main;

import fila.entities.FilaCircularDupla;

public class FilaMain {

	public static void main(String[] args) {
		FilaCircularDupla fcd=new FilaCircularDupla();
		System.out.println(fcd.isEmpty());
		fcd.enfileirarinicio("ana");
		fcd.enfileirarinicio("joaquim");
		fcd.enfileirarinicio("rita");
		System.out.println(fcd.isFull());
		System.out.println(fcd.imprimir());
		
		
	}}


