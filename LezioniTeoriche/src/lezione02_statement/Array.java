package lezione02_statement;

public class Array {
	public static void main(String[] args) {
//		Descrizione terra terra: sono contenitori di elementi simili tra loro. Simili vuol dire dello stesso tipo
//		Sequenze ordinate di tipi primitivi o riferimenti ad oggetti.
//		Sono indicizzati e sono 0-based, il primo indice parte da 0
//		Vengono identificati con le parentesi [ ]
//		In Java gli array sono Oggetti, vengono allocati nella memoria heap (quella dedicata proprio agli oggetti
			
		//Dimensione stabilita a runtime e fissa
		String[] colori = new String[5]; 
		
		//assegno ad ogni indice un colore
		colori[0] = "Blu";
		colori[1] = "Rosso";
		colori[2] = "Verde";
		colori[3] = "Rosa";
		colori[4] = "Giallo";
		
		int lunghezzaColori = colori.length;
		System.out.println("L'array contiene " + lunghezzaColori + " colori");
		
		System.out.println("Il primo colore è " + colori[0]);
		System.out.println("l'ultimo colore è " + colori[colori.length - 1]);
		
		
		//Altro modo di dichiarare un array
		//					0		1		2		  3			4
		String[] frutti = {"mela", "pera", "banana", "ananas", "albicocca"};
		
		System.out.println("Il mio array è: " + frutti); //così mi stampa l'indirizzo alla memoria e bast

		//Per stampare i singoli frutti mi devo servire di un ciclo for 
		for (String frutto : frutti) {
			System.out.println(frutto);
		}
		
		int[] numeri = {9,4,3,1,2,5};
		System.out.println("L'ultimo numero è: " + numeri[numeri.length - 1]);
		System.out.println(numeri[0]);
	}
}
