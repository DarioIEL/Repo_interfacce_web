package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Studente;

public class AssociazioniDAO {

	private static AssociazioniDAO dao;
	private final static String FILE_PATH = "AssociazioniDB.csv";
	
	//			CodCorso, CodFiscali
	private Map<String, List<String>> associazioni = new HashMap<>();
	
	private AssociazioniDAO() {
		loadFromFile();
	}
	
	public static AssociazioniDAO getAssociazioniDAO() {
		if(dao == null) {
			dao = new AssociazioniDAO() ;
		}
		return dao;
	}
	
	private void loadFromFile() {
	File file = new File(FILE_PATH);
		
		if(!file.exists()) return;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String linea;
			
			while((linea = br.readLine()) != null) {
				String[] pezzi = linea.split(",");
				if(pezzi.length == 2) {
					String codiceCorso = pezzi[0];
					String codFiscale = pezzi[1];
					
					if(!associazioni.containsKey(codiceCorso)) {
						associazioni.put(codiceCorso, new ArrayList<>());
					}
					associazioni.get(codiceCorso).add(codFiscale);
				}
			}
			
			
		} catch (Exception e) {
			System.out.println("Impossibile caricare il file ");
		}
	}

	private void saveToFile() {
		try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {		
			
			for(Map.Entry<String, List<String>> entry: associazioni.entrySet()) {
				for(String codFiscale: entry.getValue()) {
					pw.println(entry.getKey() +  ", " + codFiscale);
				}
			}
	
		} catch (IOException e) {
			System.out.println("Errore al salvataggio " + e.getMessage());
		}
		
	}
	
	public boolean addAssociazione(String codCorso, String codFiscale) {
		if(!associazioni.containsKey(codCorso)) {
			associazioni.put(codCorso, new ArrayList<>());
		}
		
		if(!associazioni.get(codCorso).contains(codFiscale)) {
			associazioni.get(codCorso).add(codFiscale);
			saveToFile();
			return true;
		}
		
		return false;
	}
	
	//Creare un metodo getStudentiByCodiceCorso 
//	public List<String> getStudentiByCodiceCorso(String codiceCorso){}
}
