package br.imd.Agenda;

import br.imd.Arvore.Node;
import br.imd.Arvore.TADArvore;
import br.imd.Agenda.Pessoa;

/**
 * 
 * @author pedroarthur-mf
 *
 */
public class Agenda {
	private TADArvore<Pessoa> lista;

	/**
	 * 
	 */
	public Agenda() {
		lista = new TADArvore<Pessoa>();
	}

	/**
	 * 
	 * @param pessoa
	 */
	public void armazenaPessoa(Pessoa pessoa) {
		lista.inserir(pessoa);
	}

	/**
	 * 
	 * @param nome
	 */
	public void removePessoa(String nome) {
		Pessoa p = new Pessoa();
		p.setNome(nome);

		lista.remover(p);
	}

	/**
	 * 
	 * @param nome
	 * @return
	 */
	public int buscarPessoa(String nome) {
		Node<Pessoa> p = new Node<Pessoa>(new Pessoa());
		p.getConteudo().setNome(nome);

		lista.getProfundidade(p);
		return 0;
	}

	/**
	 * 
	 */
	public void imprimirAgenda() {
		lista.imprimirPre();
	}

	/**
	 * 
	 * @param nome
	 */
	public void imprimirPessoa(String nome) {
		Pessoa p = new Pessoa();
		p.setNome(nome);

		// buscar p
		// se encontrou -> imprime atributos
		// não encontrou -> retorna null/erro
	}
}
