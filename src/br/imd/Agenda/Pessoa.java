package br.imd.Agenda;

import java.time.LocalDate;

/**
 * @author João Victor Bezerra Barboza
 * @author Pedro Arthur Medeiros Fernandes
 *
 * Classe que guarda as informações de um item da Agenda.
 */
public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String telefone;
	private String cpf;
	private LocalDate aniversario;

	public Pessoa() {
	}

	/**
	 * Construtor da classe Pessoa.
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
	 * Retorna a idade da Pessoa
	 * @return Idade
	 */
	public int getIdade() {
		LocalDate now = LocalDate.now();
		return now.getYear() - aniversario.getYear();
	}

	/**
	 * Retorna o nome da Pessoa
	 * @return Nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome da Pessoa
	 * @param nome Nome que será colocado
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna o telefone da Pessoa
	 * @return Telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Altera o telefone da Pessoa
	 * @param telefone Telefone que será colocado
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Retorna o CPF da Pessoa
	 * @return CPF
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Altera o CPF da Pessoa
	 * @param cpf CPF que será colocado
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Retorna a data de aniversário da Pessoa
	 * @return Data de aniversário
	 */
	public LocalDate getAniversario() {
		return aniversario;
	}

	/**
	 * Altera a data de aniversário da Pessoa
	 * @param aniversario Data de aniversário que será colocada
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
	 * Compara duas pessoas
	 * @return ]-infinito, -1], se a < b. 0, se a == b. [1, infinito[, se a > b.
	 */
	public int compareTo(Pessoa p) {
		return this.getNome().compareToIgnoreCase(p.getNome());
	}

}
