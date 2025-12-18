package lezione14_JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmDAOImpl implements FilmDAO {
	
	private Statement statement;
	private PreparedStatement ps;
	private ResultSet rs;
	private DatabaseConnection connessione;
	
	public FilmDAOImpl() {
		this.connessione = new DatabaseConnection();
		this.connessione.connetti();
	}

	@Override
	public List<Film> getFilms() {
		List<Film> allFilms = new ArrayList<>();
		
		try {
			this.ps = this.connessione.getConn().prepareStatement(GET_ALL);
			this.rs = this.ps.executeQuery();
			
			while(this.rs.next()) {
				
				Film f = new Film();
				//						  "nomeColonnaDB"
				f.setTitolo(rs.getString("titolo"));
				f.setId(rs.getInt("id"));
				f.setAutore(rs.getString("autore"));
				f.setAnno(rs.getInt("anno"));
				
				allFilms.add(f);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return allFilms;
	}

	@Override
	public Film getFilmById(int id) {
		Film f = null;
		
		try {
			this.ps = this.connessione.getConn().prepareStatement(GET_BY_ID);
			this.ps.setInt(1, id);
			this.rs = this.ps.executeQuery();
			if(this.rs.next()) {
				f = new Film();
				f.setTitolo(rs.getString("titolo"));
				f.setAutore(rs.getString("autore"));
				f.setAnno(rs.getInt("anno"));
				f.setId(rs.getInt("id"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			this.connessione.chiudiConnessione();
		}
		
		return f;
	}

	@Override
	public Film getFilmByAnno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFilm(Film film) {
		try {
			this.ps = this.connessione.getConn().prepareStatement(ADD);
			
			this.ps.setString(1, film.getTitolo());
			this.ps.setString(2, film.getAutore());
			this.ps.setInt(3, film.getAnno() );
			this.ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void removeFilm(int id) {
		try {
			this.ps = this.connessione.getConn().prepareStatement(DELETE);
			ps.setInt(1, id);
			this.ps.executeUpdate();
			System.out.println("Film rimosso");
		} catch (Exception e) {
			System.out.println(e);
		}
	} 

	@Override
	public void updateFilm(Film film) {
		// TODO Auto-generated method stub
		
	}



	

}
