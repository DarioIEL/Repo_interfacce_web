package lezione02_statement;

public class ifStatement {
	public static void main(String[] args) {
		
		/**
		 * SINTASSI
		 * if(condizione){
		 * 		codice da eseguire se condizione è TRUE
		 * 
		 * 	}
		 * else if(condizione2){ [OPZIONALE]
		 * 		da eseguire se condizione2 è TRUE
		 * }
		 * 
		 * else { [OPZIONALE]
		 * 		da eseguire se le condizioni precedenti sono FALSE
		 * 
		 * }
		 * 
		 * ATT: una volta entrati in un if non viene eseguito il resto (sotto)
		 */
		
		
		boolean pioggia;
		pioggia = false;
		
		if(pioggia) {
			System.out.println("Oggi piove, porta l'ombrello");
		}
		//l'else è opzionale
		else {
			System.out.println("Oggi non piove, vestiti come vuoi");
		}
		
		
		//esempio
		int miaEta = -20;
		
		
		if(miaEta >= 18) {
			System.out.println("Ciao, puoi entrare");
		}
		else if(miaEta < 10 && miaEta >= 0) {
			System.out.println("Mi dispiace, non puoi proprio entrare");
		}
		else if(miaEta < 0) {
			System.out.println("Attenzione, stai inserendo un'età non valida");
		}
		else {
			System.out.println("Puoi entrare ma accompagnato da un maggiorenne");
		}
		
		
		//Operatore Ternario
		int i1 = 10;
		int i2 = 8;
		
//		if(i1 == i2) {
//			System.out.println("I numeri sono uguali");
//		}else {
//			System.out.println("I numeri sono diversi");
//		}
		
		String output = (i1 == i2) ? "I numeri sono uguali" : "I numeri sono diversi";
		System.out.println(output);
		
		String nome = "Dario";
		String cognome = "Dario";
		
		//ATT: non utilizzare == per le stringhe, potrebbero puntare a due indirizzi di memoria diversi
		
		if(nome.equals(cognome)) {
			System.out.println("Hai inserito nome e cognome uguali");
		}else {
			System.out.println("Hai cognome e nome diversi");
		}
		
		
		
	}
}
