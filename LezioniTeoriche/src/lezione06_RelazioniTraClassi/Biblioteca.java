package lezione06_RelazioniTraClassi;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	String nome;
	List<Libro> libri;

	public Biblioteca(String nome) {
		this.nome = nome;
		this.libri = new ArrayList<>();
	}
	
	
	public void addLibro(Libro libro) {
		this.libri.add(libro);
	}
	
	public void addLibri(List<Libro> libri) {
		this.libri.addAll(libri);
	}
	
	public void stampaCatalogo() {
		for (Libro libro : libri) {
			System.out.println(libro);
		}
	}
	
}
