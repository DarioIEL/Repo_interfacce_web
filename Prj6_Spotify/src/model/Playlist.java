package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	private String nomePL;
	private List<Brano> listaBrani;
	private static final int SPAZIO_PL = 50;

	public Playlist(String nomePL) {
		this.nomePL = nomePL;
		this.listaBrani = new ArrayList<>();
	}

	public boolean addBrano(Brano brano) {
		if (brano != null && this.listaBrani.size() < SPAZIO_PL) {
			this.listaBrani.add(brano);
			return true;
		}

		return false;
	}

	public boolean addBrano(String cantante, String titolo, double durata) {
		if (!cantante.equals(null) && !titolo.equals(null) && durata != 0 && this.listaBrani.size() < SPAZIO_PL) {
			Brano brano = new Brano(titolo, cantante, durata);
			if (listaBrani.size() == 0) {
				this.listaBrani.add(brano);
				return true;
			} else {

				for (Brano branoInPl : listaBrani) {
					if (branoInPl.compareTo(brano) == 0) {
						System.out.println("Brano già presente");
						return false;
					}else {
						this.listaBrani.add(brano);
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean removeBrano(Brano brano) {
		if (brano != null) {
			this.listaBrani.remove(brano);
			return true;
		}
		return false;
	}

	public String infoPlaylist() {
		StringBuffer info = new StringBuffer();
		info.append("=== PLAYLIST ===");
		info.append("\nNome Playlist: " + this.nomePL);
		info.append("\nSpazio disponibile: " + (SPAZIO_PL - listaBrani.size()));
		info.append("\nLista Brani: ");

		for (Brano brano : listaBrani) {
			info.append("\n" + brano.getTitolo() + " - " + brano.getAutore());
		}

		return info.toString();
	}

}
