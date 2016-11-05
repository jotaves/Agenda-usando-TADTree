package br.imd.Teste;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import br.imd.Agenda.Agenda;
import br.imd.Agenda.Pessoa;
/**
 * @author João Victor Bezerra Barboza
 * @author Pedro Arthur Medeiros Fernandes
 *
 * Classe de teste para a classe Agenda.
 */
public class TesteAgenda {
	Agenda agenda = new Agenda();
	/**
	 * Adiciona novas pessoas a Agenda a ser testada
	 * .
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		agenda.armazenaPessoa(new Pessoa("Borges", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		agenda.armazenaPessoa(new Pessoa("Antonio", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		agenda.armazenaPessoa(new Pessoa("Pedro", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		agenda.armazenaPessoa(new Pessoa("Joao", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		agenda.armazenaPessoa(new Pessoa("Charles", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		agenda.armazenaPessoa(new Pessoa("Maria", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		agenda.armazenaPessoa(new Pessoa("Azealia", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		agenda.armazenaPessoa(new Pessoa("Angenor", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
	}
/**
 * Testa o método imprimirAgenda.
 */
	@Test
	public void testImprimeAgenda() {
		agenda.imprimeAgenda();
	}
	/**
	 * Testa o método removerPessoa para todos os casos.
	 */
	@Test
	public void testRemovePessoa() {
		assertEquals (true, agenda.removePessoa("Borges"));
		assertEquals(-1, agenda.buscaPessoa("Borges"));
		
		assertEquals (false, agenda.removePessoa("Marilia"));
		
		assertEquals (false, agenda.removePessoa("Buguinho"));
		
		assertEquals (true, agenda.removePessoa("Azealia"));
		assertEquals(-1, agenda.buscaPessoa("Azealia"));
		
		assertEquals (true, agenda.removePessoa("Antonio"));
		assertEquals(-1, agenda.buscaPessoa("Antonio"));
		
		assertEquals (false, agenda.removePessoa("Antonio"));
		
		assertEquals (true, agenda.removePessoa("Maria"));
		assertEquals(-1, agenda.buscaPessoa("Maria"));
		
		assertEquals (false, agenda.removePessoa("Fernanda"));
		
		assertEquals (true, agenda.removePessoa("Joao"));
		assertEquals(-1, agenda.buscaPessoa("Joao"));
		
		assertEquals (true, agenda.removePessoa("Pedro"));
		assertEquals(-1, agenda.buscaPessoa("Pedro"));
		
		assertEquals (true, agenda.removePessoa("Charles"));
		assertEquals(-1, agenda.buscaPessoa("Charles"));
		
		assertEquals (true, agenda.removePessoa("Angenor"));
		assertEquals(-1, agenda.buscaPessoa("Angenor"));
	}
	/**
	 * Testa o método buscarPessoa.
	 */
	@Test
	public void testBuscaPessoa() {
		assertEquals(0, agenda.buscaPessoa("Borges"));
		assertEquals(1, agenda.buscaPessoa("Pedro"));
		assertEquals(1, agenda.buscaPessoa("Antonio"));
		assertEquals(2, agenda.buscaPessoa("Angenor"));
		assertEquals(2, agenda.buscaPessoa("Azealia"));
		assertEquals(2, agenda.buscaPessoa("Joao"));
		assertEquals(3, agenda.buscaPessoa("Charles"));
		assertEquals(-1, agenda.buscaPessoa("Catarina"));
		
		assertEquals(true, agenda.removePessoa("Borges"));
		
		assertEquals(-1, agenda.buscaPessoa("Borges"));
		assertEquals(1, agenda.buscaPessoa("Pedro"));
		assertEquals(1, agenda.buscaPessoa("Antonio"));
		assertEquals(2, agenda.buscaPessoa("Angenor"));
		assertEquals(2, agenda.buscaPessoa("Azealia"));
		assertEquals(2, agenda.buscaPessoa("Joao"));
		assertEquals(0, agenda.buscaPessoa("Charles"));
	}
	/**
	 * testa a classe imprimirPessoa.
	 */
	@Test
	public void imprimePessoa() {
		agenda.imprimePessoa("Joao");
		agenda.imprimePessoa("Charles");
		agenda.imprimePessoa("Mariana");
		agenda.imprimePessoa("Borges");
	}

}
