package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Brano;

public class DatabaseCtrl {

	private List<Brano> listaBrani;
	private static final String PATH_FILE = "canzoni.csv";

	public DatabaseCtrl() {
		this.listaBrani = new ArrayList<>();
	}

	/**
	 * Questo metodo carica nella lista brani tutte le canzoni presenti nel file.
	 * Popola lista brani
	 */
	private void caricaBraniDaFile() {
		File fileBrani = new File(PATH_FILE);

		try {
			Scanner scan = new Scanner(fileBrani);

			while (scan.hasNextLine()) {
				String riga = scan.nextLine();
				String[] separate = riga.split(",");
				String cantante = separate[0];
				String titolo = separate[1];
				double durata = Double.valueOf(separate[2]);

				Brano brano = new Brano(titolo, cantante, durata);
				this.listaBrani.add(brano);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Non ci sono brani nel DB!!");
		}
	}

	public void aggiungiBranoAlDB(String titolo, String cantante, double durata) {
		Brano brano = new Brano(titolo, cantante, durata);

		try {
			FileWriter fw = new FileWriter(PATH_FILE, true); // il true serve ad aggiungere, il false cancella
			PrintWriter pw = new PrintWriter(fw);

			pw.print("\n" + brano.getAutore() + "," + brano.getTitolo() + "," + brano.getDurata());
			pw.close();
			fw.close();

			this.listaBrani.add(brano);

			System.out.println("Brano aggiunto correttamente");

		} catch (IOException e) {
			System.out.println("Impossibile aggiungere il brano");
		}
	}

	public List<Brano> getListaBrani() {
		caricaBraniDaFile();
		return listaBrani;
	}

	public boolean pulisciDB(String carattere) {
		if (carattere.equals("S")) {
			this.listaBrani.clear();

			FileWriter fw;
			try {
				fw = new FileWriter(PATH_FILE, false);
				PrintWriter pw = new PrintWriter(fw);

				pw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return true;
		} else {
			return false;
		}
	}

}
