package model;

import java.time.LocalDate;

public class Cliente {
	
	private int id;
	private String nome;
	private String cognome;
	private LocalDate dataRegistrazione;
	
	
	public Cliente() {}
	
	public Cliente(int id, String nome, String cognome, LocalDate dataRegistrazione) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataRegistrazione = dataRegistrazione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataRegistrazione() {
		return dataRegistrazione;
	}

	public void setDataRegistrazione(LocalDate dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}
	
	
	

}
