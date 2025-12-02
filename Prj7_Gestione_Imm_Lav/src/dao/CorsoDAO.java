package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Corso;

public class CorsoDAO {
	
	private static CorsoDAO dao;
	private static final String FILE_PATH = "CorsiDB.csv";
	private List<Corso> listaCorsi = new ArrayList<>();
	

	//ATT: abbiamo creato un costruttore private
	private CorsoDAO() {
		loadFromFile();
	}
	
//	public CorsoDAO() {
//		loadFromFile();
//	}
	
	public static CorsoDAO getCorsoDAO() {
		if(dao == null) {
			dao = new CorsoDAO();
		}
		return dao;
	}
	
	
	private void saveToFile() {
		try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {		
			for(Corso c: listaCorsi) {
				pw.println(c.toCSV());
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
				Corso corso = Corso.fromCSV(linea);
				listaCorsi.add(corso);
			}
		} catch (Exception e) {
			System.out.println("Impossibile caricare il file ");
		}
	}
	
	
	public boolean create(Corso corso) {
		
		for(Corso c: listaCorsi) {
			if(c.compareTo(corso) == 0) {
				System.out.println("Corso già esistente con codice: " + c.getCodice());
				return false;
			}
		}
		
		listaCorsi.add(corso);
		saveToFile();
		return true;
	}
	
	
	public Corso read(int id) {
		for(Corso corso: listaCorsi) {
			if(corso.getId() == id) {
				return corso;
			}
		}
		return null;
	}
	
	public List<Corso> readAll(){
		return new ArrayList<>(listaCorsi);
	}
	
	public boolean update(Corso corso) {
		for(int i = 0; i < listaCorsi.size(); i++) {
			if(listaCorsi.get(i).getId() == corso.getId() ) {
				listaCorsi.set(i, corso);
				saveToFile();
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(int id) {
		for(int i = 0; i < listaCorsi.size(); i++) {
			if(listaCorsi.get(i).getId() == id) {
				listaCorsi.remove(i);
				saveToFile();
				return true;
			}
		}
		return false;
	}
	
	public List<Corso> findByPattern(String title){	
		List<Corso> resultSet = new ArrayList<>();
		Pattern pattern = Pattern.compile(Pattern.quote(title), Pattern.CASE_INSENSITIVE);
		
		for(Corso corso: listaCorsi) {
			Matcher matcher = pattern.matcher(corso.getTitolo());
			if(matcher.find()) {
				resultSet.add(corso);
			}
		}
		return resultSet;
	}
	
	public int getNextIDCorso() {
		int maxID = 0;
		
		for(Corso c: listaCorsi) {
			if(c.getId() > maxID) {
				maxID = c.getId();
			}
		}
		
		return maxID + 1;
	}
	
}
