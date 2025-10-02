package lezione01_Intro;



public class Stringhe {

	public static void main(String[] args) {
		//Le stringhe non sono un tipo di dato primitivo. Servono a registrare testi, parole
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

		
		//Altro modo di dichiarare la string
		String mioNome = new String("Dario");
		
		
	}
}
