package lezione01_Intro;

public class Es1AnnoNascita {
	public static void main(String[] args) {
		String nomeCognome = "Anna Verdi";
		int annoNascita = 1989;
		int annoCorrente = 2025;
		int eta = annoCorrente - annoNascita;
		System.out.println("L'utente " + nomeCognome + " ha " + eta + " anni");
	}
}
