package lezione14_JDBC;

public class Film {
	
	private int id;
	private String titolo;
	private int anno;
	private String autore;
	
	
	
	public Film() {
	}
	
	public Film(String titolo, int anno, String autore) {
		this.titolo = titolo;
		this.anno = anno;
		this.autore = autore;
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
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", titolo=" + titolo + ", anno=" + anno + ", autore=" + autore + "]";
	}
	
	
	

}
