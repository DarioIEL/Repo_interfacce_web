package lezione02_statement;

public class Esempi_For {

	public static void main(String[] args) {
		
		//Leggere un array con un ciclo for
		String[] nomeStudenti = {
				"Mikael", //0
				"Gabriel",//1
				"Sara",//2
				"Alice",//3
				"Fernando",//4
				"Elio",//5
				"Sayed",//6
				"Valeria",//7
				"Gabriela",//8
				"Dario", //9
				"Anna" //10
		};
		
		System.out.println("Gli studenti sono " +  nomeStudenti.length);
		
		//andata
		for(int i = 0; i < nomeStudenti.length; i++) {
			System.out.println("Ciao, " + nomeStudenti[i]);
		}
		
		
		
		//ritorno
		System.out.println("Leggo al contrario");
		for(int i = nomeStudenti.length - 1; i >= 0; i--) {
			System.out.println("Ciao " + nomeStudenti[i]);
		}
		
		
		System.out.println("Stampo l'array con il foreach");
		//il foreach è costruito proprio per gli array
		for (String nome : nomeStudenti) {
			System.out.println("Ciao " + nome);
		}
		
		
		//Calcola la somma dei numeri che vanno da 1 a 100
		int somma = 0;
		
		for(int i = 0; i <= 100; i++) {
			somma += i;
		}
		
		System.out.println("La somma dei numeri che vanno da 1 a 100 è: " + somma);
		
		
		
	}
}
