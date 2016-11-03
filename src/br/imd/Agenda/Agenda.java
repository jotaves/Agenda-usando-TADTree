package br.imd.Agenda;

import br.imd.Arvore.TADArvore;

public class Agenda {
	private TADArvore lista;
	
	public Agenda(){
	    this.lista = new TADArvore();
	}

	public void armazenaPessoa(Pessoa pessoa) {
        this.lista.inserir(new Node(Pessoa));
	}

	public void removePessoa(String nome) {
        Pessoa p = lista.buscarProfundidadeObj();
        lista.remover();//tem que enviar um nó
	}

	public int buscarPessoa(String nome) {
		return 0;

	}
	
	public void imprimirAgenda(){
		
	}
	public void imprimirPessoa(String nome){
		
	}
}
