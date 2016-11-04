package br.imd.Arvore;

/**
 * 
 * @author pedroarthur-mf
 *
 * @param <T>
 */
public class Node<T> {
	private Node<T> l;
	private Node<T> r;
	private T obj;

	public Node() {
		this.l = null;
		this.r = null;
		this.obj = null;
	}

	/**
	 * @param obj
	 */
	public Node(T obj) {
		this.l = null;
		this.r = null;
		this.obj = obj;
	}

	/**
	 * @return
	 */
	public T getConteudo() {
		return this.obj;
	}

	/**
	 * @param obj
	 */
	public void setConteudo(T obj) {
		this.obj = obj;
	}

	/**
	 * @return
	 */
	public Node<T> getLeft() {
		return this.l;
	}

	/**
	 * @return
	 */
	public Node<T> getRight() {
		return this.r;
	}

	/**
	 * @param newNode
	 */
	public void setLeft(Node<T> newNode) {
		this.l = newNode;
	}

	/**
	 * @param newNode
	 */
	public void setRight(Node<T> newNode) {
		this.r = newNode;
	}
};
