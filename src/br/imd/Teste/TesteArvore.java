package br.imd.Teste;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import br.imd.Agenda.Pessoa;
import br.imd.Arvore.Node;
import br.imd.Arvore.TADArvore;

public class TesteArvore {
	TADArvore<Pessoa> l = new TADArvore<Pessoa>();

	@Before
	public void setUp() throws Exception {
		l.inserir(new Pessoa("Borges", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		l.inserir(new Pessoa("Antonio", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		l.inserir(new Pessoa("Pedro", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		l.inserir(new Pessoa("Joao", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		l.inserir(new Pessoa("Charles", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		l.inserir(new Pessoa("Maria", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		l.inserir(new Pessoa("Azealia", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		l.inserir(new Pessoa("Angenor", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
	}

	@Test
	public void testBuscarLargura() {
		Node<Pessoa> pessoa = new Node<Pessoa>(
				new Pessoa("Joao", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		Node<Pessoa> p = l.buscarLargura(pessoa.getConteudo());
		assertEquals("Joao", p.getConteudo().getNome());

		Node<Pessoa> pessoa1 = new Node<Pessoa>(
				new Pessoa("Pedro", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		Node<Pessoa> p1 = l.buscarLargura(pessoa1.getConteudo());
		assertEquals("Pedro", p1.getConteudo().getNome());
	}

	@Test
	public void testBuscarProfundidade() {
		Node<Pessoa> pessoa = new Node<Pessoa>(
				new Pessoa("Joao", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		Node<Pessoa> p = l.buscarProfundidade(pessoa.getConteudo());
		assertEquals("Joao", p.getConteudo().getNome());

		Node<Pessoa> pessoa1 = new Node<Pessoa>(
				new Pessoa("Pedro", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		Node<Pessoa> p1 = l.buscarProfundidade(pessoa1.getConteudo());
		assertEquals("Pedro", p1.getConteudo().getNome());
	}

	@Test
	public void testRemover() {
		Node<Pessoa> pessoa = new Node<Pessoa>(
				new Pessoa("Antonio", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		l.remover(pessoa.getConteudo());
		// System.out.println(l.buscarArvore(pessoa.getConteudo()).getConteudo().getNome());
		assertEquals(null, l.buscarArvore(pessoa.getConteudo()));

		l.imprimirPre();

		Node<Pessoa> pessoa1 = new Node<Pessoa>(
				new Pessoa("Pedro", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		l.remover(pessoa1.getConteudo());
		// System.out.println(l.buscarArvore(pessoa.getConteudo()).getConteudo().getNome());
		assertEquals(null, l.buscarArvore(pessoa1.getConteudo()));

		l.imprimirPre();

		Node<Pessoa> pessoa2 = new Node<Pessoa>(
				new Pessoa("Joao", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		l.remover(pessoa2.getConteudo());
		// System.out.println(l.buscarArvore(pessoa.getConteudo()).getConteudo().getNome());
		assertEquals(null, l.buscarArvore(pessoa2.getConteudo()));

		l.imprimirPre();

		l.remover(pessoa.getConteudo());

	}

	@Test
	public void testGetProfundidade() {
		Node<Pessoa> pessoa = new Node<Pessoa>(
				new Pessoa("Joao", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		int p = l.getProfundidade(pessoa);
		assertEquals(2, p);

		Node<Pessoa> pessoa1 = new Node<Pessoa>(
				new Pessoa("Pedro", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		p = l.getProfundidade(pessoa1);
		assertEquals(1, p);

		Node<Pessoa> pessoa2 = new Node<Pessoa>(
				new Pessoa("Borges", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		p = l.getProfundidade(pessoa2);
		assertEquals(0, p);
	}

	@Test
	public void testGetAltura() {
		Node<Pessoa> pessoa1 = new Node<Pessoa>(
				new Pessoa("Pedro", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		int h = l.getAltura(pessoa1);
		assertEquals(2, h);

		Node<Pessoa> pessoa2 = new Node<Pessoa>(
				new Pessoa("Borges", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		h = l.getAltura(pessoa2);
		assertEquals(3, h);

		Node<Pessoa> pessoa = new Node<Pessoa>(
				new Pessoa("Joao", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15)));
		h = l.getAltura(pessoa);
		assertEquals(1, h);

	}

	@Test
	public void testGetMenor() {
		Pessoa p = l.getMenor().getConteudo();
		assertEquals("Angenor", p.getNome());
	}

	@Test
	public void testGetMaior() {
		Pessoa p = l.getMaior().getConteudo();
		assertEquals("Pedro", p.getNome());
	}

	@Test
	public void testImprimirPre() {
		l.imprimirPre();
	}

	@Test
	public void testImprimirPos() {
		l.imprimirPos();
	}
}
