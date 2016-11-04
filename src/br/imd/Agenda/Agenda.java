package br.imd.Agenda;

import br.imd.Arvore.Node;
import br.imd.Arvore.TADArvore;
import br.imd.Agenda.Pessoa;

/**
 * 
 * @author João Victor Bezerra Barboza
 * @author Pedro Arthur Medeiros Fernandes
 * 
 * Classe que simula uma agenda eletrônica armazenada em uma árvore.
 */
public class Agenda {
	private TADArvore<Pessoa> lista;

	/**
	 * Construtor da classe Agenda.
	 */
	public Agenda() {
		lista = new TADArvore<Pessoa>();
	}

	/**
	 * Armazena pessoas na estrutura de Árvore binária.
	 * 
	 * @param pessoa Pessoa a ser adicionada.
	 */
	public void armazenaPessoa(Pessoa pessoa) {
		lista.inserir(pessoa);
	}

	/**
	 * Remove Pessoa da árvore a partir do nome da Pessoa.
	 * 
	 * @param nome Nome da pessoa que se deseja remover.
	 */
	public void removePessoa(String nome) {
		Pessoa p = new Pessoa();
		p.setNome(nome);

		lista.remover(p);
	}

	/**
	 * Buscar a posição (profundidade) de uma Pessoa na árvore a partir do nome.
	 * 
	 * @param nome Nome da Pessoa que se deseja buscar.
	 * @return Profundidade do nó da pessoa na árvore.
	 */
	public int buscarPessoa(String nome) {
		Node<Pessoa> p = new Node<Pessoa>(new Pessoa());
		p.getConteudo().setNome(nome);

		return lista.getProfundidade(p);
	}

	/**
	 * Imprime os Itens da agenda em prdem pré-fixa.
	 */
	public void imprimirAgenda() {
		lista.imprimirPre();
	}

	/**
	 * Imprime as informações de uma Pessoa específica 
	 * 
	 * @param nome O nome do da pessoa que deseja ser procurada
	 */
	public void imprimirPessoa(String nome) {
		Node<Pessoa> p = new Node<Pessoa>(new Pessoa());
		p.getConteudo().setNome(nome);
		
		System.out.println(this.lista.buscarProfundidade(p));

	}
}
