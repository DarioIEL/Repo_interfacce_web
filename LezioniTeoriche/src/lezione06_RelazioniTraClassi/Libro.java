package lezione06_RelazioniTraClassi;

import java.util.ArrayList;
import java.util.List;

public class Libro {

	String titolo;
	Autore autore;
	List<Autore> autori = new ArrayList<>();

	public Libro(String titolo, Autore autore) {
		this.titolo = titolo;
		this.autore = autore;
	}

	// overload del metodo costruttore
	public Libro(String titolo, List<Autore> autori) {
		this.titolo = titolo;
		this.autori = autori;
	}

	@Override
	public String toString() {
		if (this.autori.size() == 0) {

			return "Libro [titolo=" + titolo + ", autore=" + autore + "]";
		} else {
			System.out.println(autori.get(0).nome);
			return "Libro [titolo=" + titolo + ", autori=" + autori + "]";
		}
	}

}
