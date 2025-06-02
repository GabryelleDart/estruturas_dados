package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.ListaDinamicaDuplamenteEncadeada;
import intef.Listavel;
import entities.NoDuplo;
class ListaDinamicaTeste {
/**
 *
 */
	@Test
	void testListaDinamicaDuplamenteEncadeada() {
		fail("Not yet implemented");
	}

	@Test
	void testListaDinamicaDuplamenteEncadeadaInt() {
		fail("Not yet implemented");
	}

	@Test
	void testAnexar() {
		Listavel list=new ListaDinamicaDuplamenteEncadeada(3);
		list.anexar("Amanda");
		list.anexar("Raquel");
		list.anexar("Ruth");
		assertEquals("Amanda", list.selecionar(0));
		assertEquals("Raquel", list.selecionar(1));
		assertEquals("Ruth", list.selecionar(2));
	}

	@Test
	void testInserir() {
		Listavel list=new ListaDinamicaDuplamenteEncadeada(5);
		list.inserir(0, (Integer)10);
		list.inserir(1, (Integer)20);
		list.inserir(0, (Integer)30);
		
		assertEquals((Integer)30, list.selecionar(0));
		assertEquals((Integer)10, list.selecionar(1));
		assertEquals((Integer)20, list.selecionar(2));
	
	}

	@Test
	void testSelecionar() {
		fail("Not yet implemented");
	}

	@Test
	void testSelecionarTodos() {
		fail("Not yet implemented");
	}

	@Test
	void testAtualizar() {
		fail("Not yet implemented");
	}

	@Test
	void testApagar() {
		fail("Not yet implemented");
	}

	@Test
	void testIsFull() {
		fail("Not yet implemented");
	}

	@Test
	void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	void testImprimir() {
		fail("Not yet implemented");
	}

	@Test
	void testImprimirTrasFrente() {
		fail("Not yet implemented");
	}

}
