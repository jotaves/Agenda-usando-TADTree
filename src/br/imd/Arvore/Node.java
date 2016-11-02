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
	
	public T getConteudo(){
        return this.obj;
	}
	
	public Node getLeft(){
	    return this.l;
	}
	
	public Node getRight(){
	    return this.r;
	}
	
	public void setLeft(Node newNode){
	    this.l = newNode;
	}
	
	public void setRight(Node newNode){
	    this.r = newNode;
	}
};
    
