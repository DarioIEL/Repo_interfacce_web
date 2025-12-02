package model;

public class Studente implements Comparable<Studente>{
	
	private int id;
	private String nome;
	private String cognome;
	private String codFiscale;
	private String corsoIscritto;
	
	public Studente(int id, String nome, String cognome, String codFiscale, String corsoIscritto) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codFiscale = codFiscale;
		this.corsoIscritto = corsoIscritto;
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

	public String getCodFiscale() {
		return codFiscale;
	}

	public void setCodFiscale(String codFiscale) {
		this.codFiscale = codFiscale;
	}

	public String getCorsoIscritto() {
		return corsoIscritto;
	}

	public void setCorsoIscritto(String corsoIscritto) {
		this.corsoIscritto = corsoIscritto;
	}

	@Override
	public int compareTo(Studente altro) {
		return this.codFiscale.compareTo(altro.codFiscale);
	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", codFiscale=" + codFiscale
				+ ", corsoIscritto=" + corsoIscritto + "]";
	}

	public String toCSV() {
		return id + "," + nome + "," + cognome + "," + codFiscale + "," + corsoIscritto;
	}
	
	public static Studente fromCSV(String linea) {
		String[] pezzi = linea.split(",");
		
		return new Studente(
				Integer.parseInt(pezzi[0]),
				pezzi[1],
				pezzi[2],
				pezzi[3],
				pezzi[4]
				);				
	}

}
