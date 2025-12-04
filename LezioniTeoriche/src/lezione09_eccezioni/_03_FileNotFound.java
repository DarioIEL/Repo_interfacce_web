package lezione09_eccezioni;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class _03_FileNotFound {

	public static void main(String[] args) {
		
//		Questo è un classico esempio di Eccezione Checked
		try {
			FileReader fr = new FileReader("./mioFile.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Mi spiace, non ho trovato il file");
//			e.printStackTrace();
		}

		stampaTesto(null);
	}
	
	//Questa è un'eccezione unchecked
	private static void stampaTesto(String testo) {
		if(testo != null) {
			System.out.println("Questo è il testo: " + testo);
		}else {
			System.out.println("Non puoi avere un testo null");
		}
	}
}
