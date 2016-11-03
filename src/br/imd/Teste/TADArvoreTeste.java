package br.imd.Teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.imd.Arvore.TADArvore;


public class TADArvoreTeste {
	TADArvore<String> arvore;
	
	@Before
	public void setUp() throws Exception {
		arvore = new TADArvore<String>();
	}

	@Test
	public void arvoreString() {
		arvore.inserir("Teste3");
		arvore.inserir("Teste2");
		arvore.inserir("Teste1");
		arvore.inserir("Teste4");
		arvore.inserir("Teste5");
		arvore.inserir("Teste6");
		arvore.inserir("Teste0");
		
		arvore.imprimirPre();
		arvore.imprimirPos();
		
		assertEquals(0, arvore.buscarProfundidadePosicao("Teste3"), 0);
		assertEquals(1, arvore.buscarProfundidadePosicao("Teste2"), 1);
		assertEquals(2, arvore.buscarProfundidadePosicao("Teste1"), 2);
		assertEquals(3, arvore.buscarProfundidadePosicao("Teste0"), 0);
	}

}
