package lezione5_Classi;

import java.util.ArrayList;
import java.util.List;

public class Studente {
	
	public String nome;
	public String cognome;
	public int eta;
	public String email;
	public int matricola;
	public List<String> materie;
	
	public Studente(String nome, String cognome, int eta, String email) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.email = email;
		
		this.materie = new ArrayList<>();
		this.matricola = matricolatore();
	}
	
	private static int matricolatore() {
		int matricola = (int) Math.ceil(Math.random() * 1000);
		return matricola;
	}

	public void studia() {
		if(materie.isEmpty()) {
			System.out.println(nome + " " + cognome + " non ha nessuna materia da studiare");
			return;
		}else {
			System.out.println("Attualmente " + nome + " " + cognome + " sta studiando:\n ");
			for(String mat: materie) {
				System.out.println(" - " + mat);
			}
		}
	}
	
	
//	public void aggiungiMateria(String materia) {
//		materie.add(materia);
//		System.out.println("Matieria aggiunta: " + materia);
//	}
	
	//... varargs, rappresenta un numero variabile di argomenti senza costruire una lista
	public void aggiungiMaterie(String... materie) { //String[]
		for(String m: materie) {
			this.materie.add(m);
		}
		System.out.println("Hai aggiunto " + materie.length + " materie");
	}
	
	public void saluta() {
		System.out.println("Ciao, mi chiamo " + nome + " " + cognome);
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", email=" + email + ", matricola="
				+ matricola + ", materie=" + materie + "]";
	}
	
	
	
}
