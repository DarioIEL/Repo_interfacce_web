package lezione15_DAOv2;

import java.util.Objects;

public class Studente implements Comparable<Studente>{

	private int id;
	private String nome;
	private String cognome;
	private String corsoIscritto;
	private String codFiscale;
	
	public String getCodFiscale() {
		return codFiscale;
	}
	public void setCodFiscale(String codFiscale) {
		this.codFiscale = codFiscale;
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
	public String getCorsoIscritto() {
		return corsoIscritto;
	}
	public void setCorsoIscritto(String corsoIscritto) {
		this.corsoIscritto = corsoIscritto;
	}
	
	
	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", corsoIscritto=" + corsoIscritto
				+ "]";
	}
	
	@Override
	public int compareTo(Studente studAltro) {
		return this.codFiscale.compareTo(studAltro.codFiscale);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Studente stud = (Studente) o;
				
		return Objects.equals(codFiscale, stud.codFiscale);
	}
	
	
	
}
