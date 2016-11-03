package br.imd.Agenda;

import br.imd.Arvore.*;

/**
 * 
 * @author 
 *
 * @param <T>
 */
public class Agenda<T> {
	private TADArvore lista;
/**
 * 
 */
	public Agenda() {
		this.lista = new TADArvore();
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param pessoa
	 */
	public void armazenaPessoa(Pessoa pessoa) {
		this.lista.inserir(new Node<T>((T) pessoa));
	}

	/**
	 * @author 
	 * 
	 * @param nome
	 */
	public void removePessoa(String nome) {
		Pessoa busca = new Pessoa(nome, null, "", null);
		Pessoa p = (Pessoa) lista.buscarProfundidadeObj(busca);
		// lista.remover();// tem que enviar um nó
	}

	/**
	 * @author 
	 * 
	 * @param nome
	 * @return
	 */
	public int buscarPessoa(String nome) {
		return 0;

	}

	/**
	 * @author 
	 * 
	 */
	public void imprimirAgenda() {

	}

	/**
	 * @author 
	 * 
	 * @param nome
	 */
	public void imprimirPessoa(String nome) {

	}
}
