package pilhaduplinha;

import java.util.Scanner;

import pil.DuplamenteEmpilhavel;

public class PilhaMain {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	DuplamenteEmpilhavel ped=new PilhaEstaticaDupla(4);
	ped.push1("a");
	ped.push1("e");
	ped.push1("i");
	ped.push2("o");
	ped.push1("u");
	System.out.println(ped.imprimir1());
	System.out.println(ped.imprimir2());
	sc.close();
	}

}
