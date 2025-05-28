package unidadeII.códigos.aula19I05;
import org.junit.Test;

public class ListaDinamicaGenericaTest {
	
	@Test
	public void testApagar() {}
	@Test
	public void testapagarMultiplos() {}
	@Test
	public void testApagarEstandoVazia() {}
	@Test
	public void testInserir() {
		Listavel<String>lista =new ListaDinamicaGenerica <>(5);
		lista.inserir(0,"A");
		assertEquals("A".lista.selecionar(0));
	}
	@Test
	public void testInserirMultiplos() {
		Listavel<String>lista =new ListaDinamicaGenerica <>(5);
		lista.inserir(0,"A");
		lista.inserir(0,"B");
		lista.inserir(0,"C");
		lista.inserir(0,"D");
		lista.inserir(0,"E");
		assertEquals("E".lista.selecionar(0));
	}
	@Test
	public void testInserirEstandoCheia() {
		Listavel<String>lista =new ListaDinamicaGenerica <>(5);
		lista.inserir(0,"A");
		lista.inserir(0,"B");
		lista.inserir(0,"C");
		lista.inserir(0,"D");
		lista.inserir(0,"E");
		try {
			lista.inserir(0,"E");
			fail("nao deveria estar aqui");
		}catch(OverflowException e) {
			assertEquals("Lista Cheia",e.getMessage());
	}
}
