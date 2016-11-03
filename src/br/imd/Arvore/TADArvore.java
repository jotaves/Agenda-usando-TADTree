package br.imd.Arvore;

import br.imd.Agenda.Pessoa;

public class TADArvore<T> {
	private Node<T> raiz;

	public void inserir(Node<T> n) {
		if (raiz.getConteudo() == null) {
			this.raiz = n;
			return;
		} else {
			this.inserir(raiz, n);
		}
	}

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

	public int buscarLargura(T obj) {

		return 0;
	}

	public int buscarProfundidadePosicao(T obj) {
		return this.buscarProfundidadePosicao(raiz, obj);
	}

	private int buscarProfundidadePosicao(Node<T> n, T obj){
	    int posicao = 0;
	    if(n.getConteudo() == obj){
	        return posicao++;
	    }
	    else{
	        posicao ++;
	        this.buscarProfundidadePosicao(raiz.getLeft(), obj);
	        this.buscarProfundidadePosicao(raiz.getRight(), obj);
	    }
		return -1;
	}

	public T buscarProfundidadeObj(T obj) {
		return this.buscarProfundidadeObj(raiz, obj);
	}

	private T buscarProfundidadeObj(Node<T> n, T obj) {
		if (n.getConteudo() == obj) {
			return n.getConteudo();
		} else {
			this.buscarProfundidadeObj(n.getLeft(), obj);
			this.buscarProfundidadeObj(n.getRight(), obj);
		}
		return null;
	}

	public void remover(Node<T> n) {
		// buscarProfundidadeObj(n);
	}

	public int getProfundidade(Node<T> n){
	    int prof = 0;
		if(this.raiz == n){
		    return prof;
		}
		
		Node<T> certo = raiz;
		int compR = 0;
		
		while(certo != n){
			compR = ((Pessoa) n.getConteudo()).getNome().compareToIgnoreCase(((Pessoa) certo.getConteudo()).getNome());
	        
	        if(compR < 0) {
	            certo = certo.getLeft();
	        }
	        else if(compR > 0) {
	            certo = certo.getRight();
	        }
	        
	        prof++;
		}
		
		return prof;
	}

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

	public Node<T> getMenor() {
		Node<T> n = raiz;

		while (n.getLeft().getConteudo() != null) {
			n = n.getLeft();
		}

		return n;
	}

	public Node<T> getMaior() {
		Node<T> n = raiz;

		while (n.getRight().getConteudo() != null) {
			n = n.getRight();
		}

		return n;
	}

	private void imprimirPre(Node<T> n) {
		if (n.getConteudo() != null) {
			System.out.println("\t" + n.getConteudo());
			imprimirPre(n.getLeft());
			imprimirPre(n.getRight());
		}
	}

	public void imprimirPre() {
		System.out.println("Arvore em pré-fixo: \n");
		imprimirPre(raiz);
	}

	public void imprimirPos() {
		System.out.println("Arvore em pos-fixo: \n");
		this.imprimirPos(raiz);
	}

	private void imprimirPos(Node<T> n){
	    if(n.getConteudo() != null){
	         System.out.println("\t" + n.getConteudo());
	         imprimirPos(n.getRight());
	         imprimirPos(n.getLeft());
	    }
	}
}
