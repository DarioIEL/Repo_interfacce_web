package lezione14_JDBC;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

//		Questo sotto mi serve solo per testare il connect JDBC
//		DatabaseConnection connessione = new DatabaseConnection();
//		connessione.getConnection();
//		connessione.connetti();
//		connessione.chiudiConnessione();
		
		//NON ho più bisogno della connessione poiché è implementata in FilmDAOImpl
		
		FilmDAO film = new FilmDAOImpl();
		List<Film> listaCompleta = new ArrayList<>();
		
		listaCompleta = film.getFilms();
		
		
		for(Film f: listaCompleta) {
			System.out.println(f.toString());
		}
		
//		Film nuovoFilm = new Film("Titanic", 1996, "James Cameron");
//		film.addFilm(nuovoFilm);
		
//		film.removeFilm(8);
		
		System.out.println("=== FILM BY ID ===");
		Film singoloFilm = film.getFilmById(1);
		System.out.println(singoloFilm);
		
		
	}
}
