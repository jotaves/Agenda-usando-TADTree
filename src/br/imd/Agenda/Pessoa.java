package br.imd.Agenda;

import java.time.LocalDate;

/**
 * 
 * @author pedroarthur-mf
 *
 */
public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String telefone;
	private String cpf;
	private LocalDate aniversario;

	public Pessoa() {
	}

	/**
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
	 * 
	 * @return
	 */
	public int getIdade() {
		LocalDate now = LocalDate.now();
		return now.getYear() - aniversario.getYear();
	}

	/**
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * @return
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * 
	 * @return
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * 
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * 
	 * @return
	 */
	public LocalDate getAniversario() {
		return aniversario;
	}

	/**
	 * 
	 * @param aniversario
	 */
	public void setAniversario(LocalDate aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf + ", aniversario=" + aniversario
				+ "]\n";
	}

	/**
	 * 
	 */
	public int compareTo(Pessoa p) {
		return this.getNome().compareToIgnoreCase(p.getNome());
	}

}
