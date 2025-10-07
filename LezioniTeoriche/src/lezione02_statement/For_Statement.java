package lezione02_statement;

public class For_Statement {
	
	public static void main(String[] args) {
		

		//FOR: cicli definiti, il numero di giri è un numero finito
		for(int i = 0; i <= 3; i++) {
			System.out.println("Ciao " + i);
		}
		
		/**
		 * for(int i = 0; i < 3; i++){}
		 * 
		 * 1° giro ( i = 0; 0 < 3 [TRUE]; i = 1) eseguo il codice
		 * 2° giro ( i = 1; 1 < 3 [TRUE]; i = 2) eseguo il codice
		 * 3° giro ( i = 2; 2 < 3 [TRUE]; i = 3) eseguo il codice
		 * 4° giro ( i = 3; 3 < 3 [FALSE]) qui si chiude il ciclo
		 */
		
		
		System.out.println("FOR INVERSO");
		//FOR inverso
		for(int i = 2; i >= 0;i--) {
			System.out.println("Ciao " + i);
		}
		
		//For con doppia variabile
		for(int a = 0, b = 9; b >= 0; b--, a++ ) {
			System.out.println("a vale: " + a + ". b vale: " + b);
		}
		
		//For con il break: interrompere un ciclo
		System.out.println("For con il break");
		for(int i = 0; i < 10; i++) {
			
			if(i == 5) {
				break; //salta fuori dal ciclo senza neppure eseguire quello che si trova sotto. Il ciclo viene completamente interrotto
			}
			System.out.println(i);
		}
		
		
		//For con continue: saltare un giro 
		System.out.println("For con il continue");
		
		for(int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;// salto fuori dal ciclo ma poi il ciclo continua ad essere eseguito
			}
			System.out.println(i);
		}

		
		
	}

}
