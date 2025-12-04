package lezione10_ENUM;



public class Main {
	
	public static void main(String[] args) {
		
		Colore primoColore = Colore.BLUE;
		Colore secondoColore = Colore.ORANGE;
		
		System.out.println(primoColore.getNomeIta());
		System.out.println(secondoColore.getNomeIta());
		
		switch(Colore.BLACK) {
		case RED:
			System.out.println("Hai scelto il rosso");
			break;
		case BLUE:
			System.out.println("Hai scelto il " + Colore.BLUE.getNomeIta());
			break;
		case BLACK:
			System.out.println("Hai scelto il colore " + Colore.BLACK.getNomeIta());
			break;
		default:
			System.out.println("Non hai sceltro nessun colore");
			break;
		}
		
		
		Giorno oggi = Giorno.GIOVEDI;
		System.out.println("Oggi è " + oggi);
		
		
		double risultato = Operazioni.PRODOTTO.calcola(4, 5);
		System.out.println(risultato);
		
		System.out.println(EstensioneFile.PDF.estensione());
		if(EstensioneFile.PDF.supportoImg()) {
			System.out.println("Questa estensione supporta le immagini");
		}else {
			System.out.println("Questa estensione non supporta le immagini");
		}
	}

}
