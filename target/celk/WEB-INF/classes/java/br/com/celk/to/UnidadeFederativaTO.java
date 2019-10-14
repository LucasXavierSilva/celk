package br.com.celk.to;

import java.time.LocalDateTime;

/**
 * @author Lucas
 *
 */
public class UnidadeFederativaTO {
	private Integer id;
	private String nome;
	private String sigla;
	private LocalDateTime data;

	/**
	 * @param id
	 * @param nome
	 * @param sigla
	 * @param data
	 */
	public UnidadeFederativaTO(Integer id, String nome, String sigla, LocalDateTime data) {
		this.id = id;
		this.nome = nome;
		this.sigla = sigla;
		this.data = data;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @param sigla the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	/**
	 * @return the data
	 */
	public LocalDateTime getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(LocalDateTime data) {
		this.data = data;
	}
}
