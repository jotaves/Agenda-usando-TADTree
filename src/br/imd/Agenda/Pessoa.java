package br.imd.Agenda;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String telefone;
	private String cpf;
	private LocalDate aniversario;

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param nome
	 * @param telefone
	 * @param cpf
	 * @param aniversario
	 */
	public Pessoa(String nome, String telefone, String cpf, LocalDate aniversario) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.aniversario = aniversario;
	}

	/**
	 * @author João Victor
	 * 
	 * @return
	 */
	public int getIdade() {
		LocalDate now = LocalDate.now();
		return now.getYear() - aniversario.getYear();
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @return
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @return
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @return
	 */
	public LocalDate getAniversario() {
		return aniversario;
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 * @param aniversario
	 */
	public void setAniversario(LocalDate aniversario) {
		this.aniversario = aniversario;
	}

	/**
	 * @author Pedro Arthur Medeiros Ferandes
	 * 
	 */
	@Override
	public String toString() {
		return "[nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf + ", aniversario=" + aniversario + "]\n";
	}

}
