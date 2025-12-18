package lezione14_JDBC;entity

import java.util.ArrayList;
import java.util.List;

public interface FilmDAO {
	
	String GET_ALL = "select * from films";
	String GET_BY_ID = "select * from films where id = ?";
	String GET_BY_ANNO = "select * from films where anno = ?";
	String ADD = "insert into films (titolo, autore, anno) values (?,?,?)";
	String DELETE = "delete from films where id = ?";
	
	List<Film> getFilms();
	Film getFilmById(int id);
	Film getFilmByAnno();
	
	void addFilm(Film film);
	void updateFilm(Film film);
	void removeFilm(int id);
	

}
