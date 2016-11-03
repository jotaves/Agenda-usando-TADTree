package br.imd.Arvore;

public class Node<T> {
	private Node<T> l;
	private Node<T> r;
	private T obj;
	
	public Node() {
		this.l = null;
		this.r = null;
		this.obj = null;		
	}

	public Node(T obj) {
		this.l = null;
		this.r = null;
		this.obj = obj;
	}

	public T getConteudo() {
		return this.obj;
	}

	public void setConteudo(T obj) {
		this.obj = obj;
	}

	public Node<T> getLeft() {
		return this.l;
	}

	public Node<T> getRight() {
		return this.r;
	}

	public void setLeft(Node<T> newNode) {
		this.l = newNode;
	}

	public void setRight(Node<T> newNode) {
		this.r = newNode;
	}
};
