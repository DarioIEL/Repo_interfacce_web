package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Brano;
import model.Playlist;

public class PlaylistCtrl {

	private Playlist playlist;
	private Scanner scan;

	public PlaylistCtrl(String nomePL) {
		this.playlist = new Playlist(nomePL);
	}
	
	
	public void addBranoPL() {
		//Dopo questo scanner va nel main 
		scan = new Scanner(System.in);
		System.out.println("Aggiungi un brano alla playlist: ");
		System.out.println("Inserisci la/il cantante: ");
		String cantante = scan.nextLine();
		System.out.println("Inserisci il titolo del brano: ");
		String titolo = scan.nextLine();
		
		
		if(playlist.addBrano(cantante, titolo, 2.5)) {
			System.out.println("Brano aggiunto correttamente");
		}else {
			System.out.println("Impossibile aggiungere il brano");
		}
	}
	
	
	public void addBraniDaDB(List<Brano> braniDB) {
		
		for (Brano brano : braniDB) {
			playlist.addBrano(brano);
		}
	}
	
	public void infoPlaylist() {
		System.out.println(playlist.infoPlaylist());
	}
}
