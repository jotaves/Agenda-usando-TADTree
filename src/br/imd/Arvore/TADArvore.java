package br.imd.Arvore;

import br.imd.Agenda.Pessoa;

/**
 * 
 * @author 
 *
 * @param <T>
 */
public class TADArvore<T> {
	private Node<T> raiz;

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * @param n
	 */
	public void inserir(Node<T> n) {
		if (raiz.getConteudo() == null) {
			this.raiz = n;
			return;
		} else {
			this.inserir(raiz, n);
		}
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param pai
	 * @param n
	 */
	private void inserir(Node<T> pai, Node<T> n) {
		int compR = ((Pessoa) n.getConteudo()).getNome().compareToIgnoreCase(((Pessoa) pai.getConteudo()).getNome());

		if (compR < 0 && pai.getLeft() == null) {
			pai.setLeft(n);
		}

		else if (compR < 0 && pai.getLeft() != null) {
			inserir(pai.getLeft(), n);
		}

		else if (compR > 0 && pai.getRight() == null) {
			pai.setRight(n);
		}

		else if (compR > 0 && pai.getRight() != null) {
			inserir(pai.getLeft(), n);
		}
	}

	/**
	 * @author 
	 * @param obj
	 * @return
	 */
	public int buscarLargura(T obj) {

		return 0;
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param obj
	 * @return
	 */
	public int buscarProfundidadePosicao(T obj) {
		return this.buscarProfundidadePosicao(raiz, obj);
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param n
	 * @param obj
	 * @return
	 */
	private int buscarProfundidadePosicao(Node<T> n, T obj) {
		int posicao = 0;
		if (n.getConteudo() == obj) {
			return posicao++;
		} else {
			posicao++;
			this.buscarProfundidadePosicao(raiz.getLeft(), obj);
			this.buscarProfundidadePosicao(raiz.getRight(), obj);
		}
		return -1;
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param obj
	 * @return
	 */
	public T buscarProfundidadeObj(T obj) {
		return this.buscarProfundidadeObj(raiz, obj);
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param n
	 * @param obj
	 * @return
	 */
	private T buscarProfundidadeObj(Node<T> n, T obj) {
		if (n.getConteudo() == obj) {
			return n.getConteudo();
		} else {
			this.buscarProfundidadeObj(n.getLeft(), obj);
			this.buscarProfundidadeObj(n.getRight(), obj);
		}
		return null;
	}

	/**
	 * @author 
	 * 
	 * @param n
	 */
	public void remover(Node<T> n) {
		// buscarProfundidadeObj(n);
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param n
	 * @return
	 */
	public int getProfundidade(Node<T> n) {
		int prof = 0;
		if (this.raiz == n) {
			return prof;
		}

		Node<T> certo = raiz;
		int compR = 0;

		while (certo != n) {
			compR = ((Pessoa) n.getConteudo()).getNome().compareToIgnoreCase(((Pessoa) certo.getConteudo()).getNome());

			if (compR < 0) {
				certo = certo.getLeft();
			} else if (compR > 0) {
				certo = certo.getRight();
			}

			prof++;
		}

		return prof;
	}

	/**
	 * @author João Victor
	 * 
	 * @param n
	 * @return
	 */
	public int getAltura(Node<T> n) {
		if (n == null) {
			return -1;
		} else {
			// altura da sub-árvore esquerda
			int ae = getAltura(n.getLeft());
			// altura da sub-árvore direita
			int ad = getAltura(n.getRight());

			// retorna a maior altura entre as sub-árvores
			if (ae < ad)
				return ad + 1;
			else
				return ae + 1;
		}
	}

	/**
	 * @author João Victor
	 * 
	 * @return
	 */
	public Node<T> getMaior() {
		Node<T> n = raiz;

		while (n.getRight().getConteudo() != null) {
			n = n.getRight();
		}

		return n;
	}

	/**
	 * @author João Victor
	 * 
	 * @param n
	 */
	private void imprimirPre(Node<T> n) {
		if (n.getConteudo() != null) {
			System.out.println("\t" + n.getConteudo());
			imprimirPre(n.getLeft());
			imprimirPre(n.getRight());
		}
	}

	/**
	 * @author João Victor
	 * 
	 */
	public void imprimirPre() {
		System.out.println("Arvore em pré-fixo: \n");
		imprimirPre(raiz);
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 */
	public void imprimirPos() {
		System.out.println("Arvore em pos-fixo: \n");
		this.imprimirPos(raiz);
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param n
	 */
	private void imprimirPos(Node<T> n) {
		if (n.getConteudo() != null) {
			System.out.println("\t" + n.getConteudo());
			imprimirPos(n.getRight());
			imprimirPos(n.getLeft());
		}
	}
}
