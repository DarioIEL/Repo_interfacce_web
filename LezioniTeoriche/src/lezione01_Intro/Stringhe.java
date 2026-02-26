package lezione01_Intro;

import java.util.Arrays;

public class Stringhe {

	public static void main(String[] args) {
		// Le stringhe non sono un tipo di dato primitivo. Servono a registrare testi,
		// parole
		String nomeCorso = "Tecnico di sviluppo interfacce WEB";
		System.out.println(nomeCorso);

		System.out.println("La stringa è formata da " + nomeCorso.length() + " caratteri");
		System.out.println(nomeCorso.charAt(0));
		System.out.println(nomeCorso.contains("WEB"));
		System.out.println(nomeCorso.substring(2, 6));
		System.out.println(nomeCorso.replace('e', '3'));

		String nuovaStr = nomeCorso.replace('e', '0');
		System.out.println(nuovaStr);

		System.out.println(nomeCorso);

		// Altro modo di dichiarare la string
		String mioNome = new String("Dario");
		String tuoNome = new String("Dario");
		
		if(mioNome.equals(tuoNome)) {
			System.out.println("Abbiamo lo stesso nome");
		}else {
			System.out.println("Abbiamo due nomi diversi");
		}
		

		String saluto = "Ciao come stai?";

		String[] splitted = saluto.split(" come "); // in questo caso splitta quando vede la virgola ,

		System.out.println(Arrays.toString(splitted));

		String canzone = "Nino d'Angelo, Popcorn, 1.3";
		String[] split = canzone.split(",");
		System.out.println(Arrays.toString(split));
		String cantante = split[0];
		String titolo = split[1];
		Double durata = Double.valueOf(split[2]);

		System.out.println("Canzone: " + titolo + "\nCantante: " + cantante + "\nDurata: " + durata);
	}
}
