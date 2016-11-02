package br.imd.Agenda;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String telefone;
	private String cpf;
	private LocalDate aniversario;
	
	public Pessoa(String nome, String telefone, String cpf, LocalDate aniversario) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.aniversario = aniversario;
	}
	
	//TODO
	public int getIdade() {
		LocalDate now = LocalDate.now();
		return aniversario.get
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getAniversario() {
		return aniversario;
	}
	public void setAniversario(LocalDate aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf + ", aniversario=" + aniversario
				+ "]";
	}
	
	
}
