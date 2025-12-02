package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import model.Corso;
import model.Studente;

public class StudenteDAO {
	
	private static StudenteDAO dao;
	private static final String FILE_PATH = "studenti.csv";
	private List<Studente> listaStudenti = new ArrayList<>();
	
	private StudenteDAO() {
		loadFromFile();
	}

	public static StudenteDAO getStudenteDAO() {
		if(dao == null) {
			dao = new StudenteDAO();
		}
		return dao;
	}
	
	private void saveToFile() {
		try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {		
			for(Studente s: listaStudenti) {
				pw.println(s.toCSV());
			}
	
		} catch (IOException e) {
			System.out.println("Errore al salvataggio " + e.getMessage());
		}
	}
	
	private void loadFromFile() {
		File file = new File(FILE_PATH);
		
		if(!file.exists()) return;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String linea;
			while((linea = br.readLine()) != null) {
				Studente studente = Studente.fromCSV(linea);
				listaStudenti.add(studente);
			}
		} catch (Exception e) {
			System.out.println("Impossibile caricare il file ");
		}
	}
	
public boolean create(Studente studente) {
		
		for(Studente s: listaStudenti) {
			if(s.compareTo(studente) == 0) {
				System.out.println("Corso già esistente con codice: " + s.getCodFiscale());
				return false;
			}
		}
		
		listaStudenti.add(studente);
		saveToFile();
		return true;
	}
	
	public Studente read(int id) {
		for(Studente stud: listaStudenti) {
			if(stud.getId() == id) {
				return stud;
			}
		}
		return null;
	}
	
	public List<Studente> readAll(){
		return new ArrayList<>(listaStudenti);
	}

	public boolean update(Studente studente) {
		for(int i = 0; i < listaStudenti.size(); i++) {
			if(listaStudenti.get(i).getId() == studente.getId() ) {
				listaStudenti.set(i, studente);
				saveToFile();
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(int id) {
		for(int i = 0; i < listaStudenti.size(); i++) {
			if(listaStudenti.get(i).getId() == id) {
				listaStudenti.remove(i);
				saveToFile();
				return true;
			}
		}
		return false;
	}
	
	public List<Studente> findByCorso(String codiceCorso){
		List<Studente> resultSet = new ArrayList<>();
		
		for(Studente stud: listaStudenti){
			if(stud.getCorsoIscritto().equals(codiceCorso)) {
				resultSet.add(stud);
			}
		} 
		
		return resultSet;
	}
	
	public Studente findByCodiceFiscale(String codFisc) {
		for(Studente stud: listaStudenti) {
			if(stud.getCodFiscale().equals(codFisc)) {
				return stud;
			}
		}
		return null;
	}
	
	
	public int getNextIDStudente() {
		int maxID = 0;
		
		for(Studente s: listaStudenti) {
			if(s.getId() > maxID) {
				maxID = s.getId();
			}
		}
		
		return maxID + 1;
	}
	
}
