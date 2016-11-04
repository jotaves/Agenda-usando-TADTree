package br.imd.Arvore;

import java.util.LinkedList;
import java.util.Queue;

public class TADArvore<T extends Comparable<T>> {
	private Node<T> raiz;

	public TADArvore() {
		this.raiz = null;
	}

	public void inserir(T t) {
		Node<T> n = new Node<T>(t);

		if (raiz == null) {
			this.raiz = n;
		} else {
			this.inserir(raiz, n);
		}
	}

	private void inserir(Node<T> pai, Node<T> n) {
		// modificado
		int compR = n.getConteudo().compareTo(pai.getConteudo());

		if (compR < 0 && pai.getLeft() == null) {
			pai.setLeft(n);
		} else if (compR < 0 && pai.getLeft() != null) {
			inserir(pai.getLeft(), n);
		} else if (compR > 0 && pai.getRight() == null) {
			pai.setRight(n);
		} else if (compR > 0 && pai.getRight() != null) {
			inserir(pai.getRight(), n);
		}
	}

	public Node<T> buscarLargura(T obj) {
		if (obj == null || this.raiz == null) {
			return null;
		}

		Queue<Node<T>> fila = new LinkedList<Node<T>>();
		fila.add(this.raiz);

		while (!fila.isEmpty()) {
			if (obj.compareTo(fila.element().getConteudo()) == 0) {
				return fila.element();
			}
			if (fila.element().getLeft() != null) {
				fila.add(fila.element().getLeft());
			}
			if (fila.element().getRight() != null) {
				fila.add(fila.element().getRight());
			}
			fila.remove();
		}
		return null;
	}

	public Node<T> buscarArvore(T obj) {
		return this.buscarArvore(raiz, obj);
	}

	private Node<T> buscarArvore(Node<T> n, T obj) {
		if (n == null)
			return null;

		int compR = n.getConteudo().compareTo(obj);

		if (compR == 0)
			return n;
		else if (compR > 0)
			return buscarArvore(n.getLeft(), obj);
		else if (compR < 0)
			return buscarArvore(n.getRight(), obj);
		else
			return null;
	}

	public Node<T> buscarProfundidade(T obj) {
		if (obj == null) {
			return null;
		}
		if (raiz.getConteudo().compareTo(obj) == 0) {
			return raiz;
		} else {
			Node<T> resultado = buscarProfundidade(raiz.getLeft(), obj);
			if (resultado == null) {
				resultado = buscarProfundidade(raiz.getRight(), obj);
			}
			return resultado;
		}
	}

	private Node<T> buscarProfundidade(Node<T> n, T obj) {
		if (n == null)
			return null;
		if (n.getConteudo().compareTo(obj) == 0) {
			return n;
		} else {
			Node<T> resultado = buscarProfundidade(n.getLeft(), obj);
			if (resultado == null)
				resultado = buscarProfundidade(n.getRight(), obj);
			return resultado;
		}
	}

	public Boolean remover(T obj) {
		if (buscarArvore(obj) == null) {
			return false;
		}
		Node<T> pai = raiz;
		Node<T> rm = raiz;

		if (obj == null)
			return false;

		int compR = obj.compareTo(pai.getConteudo());

		while ((pai.getLeft() != null || pai.getRight() != null) && compR != 0) {
			pai = rm;
			if (compR < 0) {
				rm = rm.getLeft();
			} else
				rm = rm.getRight();
			compR = obj.compareTo(rm.getConteudo());
		}

		// elemento a ser removido não está na árvore
		if (obj.compareTo(rm.getConteudo()) != 0)
			return false;

		else if (rm.getLeft() == null && rm.getRight() == null) {
			compR = pai.getConteudo().compareTo(rm.getConteudo());
			if (compR < 0) {
				pai.setRight(null);
			} else {
				pai.setLeft(null);
			}
			return true;
		}

		else if ((rm.getLeft() == null && rm.getRight() != null)) {
			compR = pai.getConteudo().compareTo(rm.getConteudo());
			if (compR < 0) {
				pai.setRight(rm.getRight());
			} else {
				pai.setLeft(rm.getRight());
			}
			return true;
		}

		else if (rm.getLeft() != null && rm.getRight() == null) {
			compR = pai.getConteudo().compareTo(rm.getConteudo());
			if (compR < 0) {
				pai.setRight(rm.getLeft());
			} else {
				pai.setLeft(rm.getLeft());
			}
			return true;
		} else {
			T subs = this.getMenor(rm.getRight()).getConteudo();
			this.remover(subs);
			rm.setConteudo(subs);
			return true;
		}

	}

	public int getProfundidade(Node<T> n) {
		// fazer busca para achar n na árvore e poder pegar os filhos
		// se o resultado da busca for null, return -1
		// se o resultado não for null, faz o código abaixo
		// substituir por esse if n == null, que só testa no caso de ser a raiz

		if (n == null) {
			return -1;
		}

		int compR = n.getConteudo().compareTo(raiz.getConteudo());

		if (compR == 0) {
			return 0;
		}

		else if (compR < 0) {
			return 1 + this.getProfundidade(n, raiz.getLeft());
		} else {
			return 1 + this.getProfundidade(n, raiz.getRight());
		}
	}

	private int getProfundidade(Node<T> n, Node<T> pai) {

		int compR = n.getConteudo().compareTo(pai.getConteudo());

		if (compR == 0) {
			return 0;
		} else if (compR < 0) {
			return 1 + this.getProfundidade(n, pai.getLeft());
		} else {
			return 1 + this.getProfundidade(n, pai.getRight());
		}
	}

	public int getAltura(Node<T> n) {
		if (n == null) {
			return -1;
		} else {
			n = this.buscarArvore(n.getConteudo());
			// altura da sub-árvore esquerda
			int ae = 1 + getAltura(n.getLeft());
			// altura da sub-árvore direita
			int ad = 1 + getAltura(n.getRight());

			// retorna a maior altura entre as sub-árvores
			if (ae < ad) {
				return ad;
			} else {
				return ae;
			}
		}
	}

	public Node<T> getMenor() {
		Node<T> n = this.raiz;

		while (n.getLeft() != null) {
			n = n.getLeft();
		}
		return n;
	}

	private Node<T> getMenor(Node<T> raiz) {
		Node<T> n = raiz;

		while (n.getLeft() != null) {
			n = n.getLeft();
		}
		return n;
	}

	public Node<T> getMaior() {
		Node<T> n = raiz;

		while (n.getRight() != null) {
			n = n.getRight();
		}
		return n;
	}

	private void imprimirPre(Node<T> n) {
		if (n != null) {
			System.out.print("\t" + n.getConteudo());
			imprimirPre(n.getLeft());
			imprimirPre(n.getRight());
		}
	}

	public void imprimirPre() {
		System.out.print("Arvore em pré-fixo: [\n");
		imprimirPre(raiz);
		System.out.println("]");
	}

	public void imprimirPos() {
		System.out.print("Arvore em pós-fixo: [\n");
		imprimirPos(raiz);
		System.out.println("]");
	}

	private void imprimirPos(Node<T> n) {
		if (n != null) {
			imprimirPos(n.getLeft());
			imprimirPos(n.getRight());
			System.out.print("\t" + n.getConteudo());
		}
	}
}