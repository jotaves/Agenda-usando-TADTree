package br.imd.Agenda;

import br.imd.Arvore.*;

public class Agenda<T>{
	private TADArvore lista;

	public Agenda() {
		this.lista = new TADArvore();
	}

	public void armazenaPessoa(Pessoa pessoa) {
		this.lista.inserir(new Node<T>((T) pessoa));
	}

	public void removePessoa(String nome) {
		Pessoa busca = new Pessoa(nome, null, "", null);
		Pessoa p = (Pessoa) lista.buscarProfundidadeObj(busca);
		//lista.remover();// tem que enviar um nó
	}

	public int buscarPessoa(String nome) {
		return 0;

	}

	public void imprimirAgenda() {

	}

	public void imprimirPessoa(String nome) {

	}
}
