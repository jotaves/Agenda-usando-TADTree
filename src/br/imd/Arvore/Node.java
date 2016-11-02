package br.imd.Arvore;

import br.imd.Agenda.Pessoa;

public class Node<T> {
	private Node l;
	private Node r;
	private T obj;

	public Node(T obj) {
		this.l = null;
		this.r = null;
		this.obj = obj;
	}

};
