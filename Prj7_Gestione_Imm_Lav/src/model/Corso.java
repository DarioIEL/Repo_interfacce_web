package model;

public class Corso implements Comparable<Corso> {
	private int id;
	private String titolo;
	private String codice;
	private int numPartecipanti;

	public Corso(int id, String titolo, String codice, int numPartecipanti) {
		this.id = id;
		this.titolo = titolo;
		this.codice = codice;
		this.numPartecipanti = numPartecipanti;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public int getNumPartecipanti() {
		return numPartecipanti;
	}

	public void setNumPartecipanti(int numPartecipanti) {
		this.numPartecipanti = numPartecipanti;
	}

	@Override
	public int compareTo(Corso altro) {
		return this.codice.compareTo(altro.codice);
	}
	

	@Override
	public String toString() {
		return "Corso [id=" + id + ", titolo=" + titolo + ", codice=" + codice + ", numPartecipanti=" + numPartecipanti
				+ "]";
	}

	public String toCSV() {
		return id + "," + titolo + "," + codice + "," + numPartecipanti;
	}

	public static Corso fromCSV(String linea) {
		String[] pezzi = linea.split(",");
		
		return new Corso(
				Integer.parseInt(pezzi[0]),
				pezzi[1],
				pezzi[2],
				Integer.parseInt(pezzi[3]));
	}
	
	

}
