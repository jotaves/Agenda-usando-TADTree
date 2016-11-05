package br.imd.Agenda;

import br.imd.Arvore.Node;
import br.imd.Arvore.TADArvore;
import br.imd.Agenda.Pessoa;

/**
 * Classe que simula uma agenda eletrônica armazenada em uma árvore.
 * 
 * @author João Victor Bezerra Barboza
 * @author Pedro Arthur Medeiros Fernandes
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
	 * @param pessoa
	 *            Pessoa a ser adicionada.
	 */
	public void armazenaPessoa(Pessoa pessoa) {
		lista.inserir(pessoa);
	}

	/**
	 * Remove Pessoa da árvore a partir do nome da Pessoa.
	 * 
	 * @param nome
	 *            Nome da pessoa que se deseja remover.
	 * 
	 * @return true caso removido e false caso o que se deseja remover não
	 *         esteja presente.
	 *
	 */
	public boolean removePessoa(String nome) {
		Pessoa p = new Pessoa();
		p.setNome(nome);

		return lista.remover(p);
	}

	/**
	 * Buscar a posição (profundidade) de uma Pessoa na árvore a partir do nome.
	 * 
	 * @param nome
	 *            Nome da Pessoa que se deseja buscar.
	 * @return Profundidade do nó da pessoa na árvore.
	 */
	public int buscaPessoa(String nome) {
		Node<Pessoa> p = new Node<Pessoa>(new Pessoa());
		p.getConteudo().setNome(nome);

		return lista.getProfundidade(p);
	}

	/**
	 * Imprime os Itens da agenda em prdem pré-fixa.
	 */
	public void imprimeAgenda() {
		lista.imprimirPos();
	}

	/**
	 * Imprime as informações de uma Pessoa específica
	 * 
	 * @param nome
	 *            O nome do da pessoa que deseja ser procurada
	 */
	public void imprimePessoa(String nome) {
		Node<Pessoa> p = new Node<Pessoa>(new Pessoa());
		p.getConteudo().setNome(nome);

		Node<Pessoa> r = lista.buscarProfundidade(p.getConteudo());

		if (r != null)
			System.out.print(r.getConteudo());

	}
}
