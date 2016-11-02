package br.imd.Teste;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import br.imd.Agenda.Pessoa;

public class PessoaTeste {
	private Pessoa p;

	@Before
	public void setUp() throws Exception {
		p = new Pessoa ("Pedro", "3216-5498", "123456789-12", LocalDate.of(1990, 12, 15));
	}

	@Test 
	public void testarGetIdade() {
		assertEquals(26, p.getIdade(), 0);
	}

}
