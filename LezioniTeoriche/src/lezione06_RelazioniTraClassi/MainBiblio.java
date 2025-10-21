package lezione06_RelazioniTraClassi;

import java.util.Arrays;

public class MainBiblio {

	public static void main(String[] args) {

		Libro l1 = new Libro("Diario di Anna Frank", new Autore("Anna", "Frank"));
		Libro l2 = new Libro("Memorie del sottosuolo", new Autore("Fedor", "Dostoevskij"));
		Libro l3 = new Libro("It", new Autore("Stephen","King"));
		Libro l4 = new Libro("Opera Nova", new Autore("Achille", "Marozzo"));
		Libro l5 = new Libro("Promessi sposi", new Autore("Alessandro", "Manzoni"));
		Libro l6 = new Libro("Marianela", new Autore("Benito", "Perez"));
		Libro l7 = new Libro("La versione di Barney", new Autore("Mordecai", "Richler"));
		Libro l8 = new Libro("Corso di Java & JS", Arrays.asList(new Autore("Dario", "Mennillo"), new Autore("Milo", "Spandre")));
		
		
		Biblioteca bibliotecaCentrale = new Biblioteca("Centrale");
		
		bibliotecaCentrale.addLibri(Arrays.asList(l1,l2,l3, l4, l5, l6, l7, l8));
		
//		System.out.println(bibliotecaCentrale.libri);
		bibliotecaCentrale.stampaCatalogo();
		
	}
}
