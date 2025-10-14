package giochi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tombola {

	public static int chiediNumeri() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ciao utente, quanti numeri vuoi estrarre ? ");
		
		int numDaEstrarre = 0;
		do {
			numDaEstrarre = scan.nextInt();
			
		}while(numDaEstrarre < 0 && numDaEstrarre >= 90);
		
		return numDaEstrarre;
	}
	
	//Sviluppa il gioco della Tombola. Chiedi all'utente quanti numeri devono essere estratti. I numeri in totale sono 90. Att: non bisogna che si ripetano dei numeri
	public static void estrazione() {
		//Inserire uno scanner che chiede quanti numeri vuole estrarre l'utente
		
		int numDaEstrarre = chiediNumeri();
		
		int[] numEstratti = new int[numDaEstrarre];
		
		Random numRand = new Random();
		
		int numGiri = 0;
		int numDoppi = 0;
		
		
		for(int i = 0; i < numEstratti.length; i++) {
			numEstratti[i] = numRand.nextInt(90) + 1;
			
			for(int j = 0; j < i; j++) {
				if(numEstratti[j] == numEstratti[i]) {
					numDoppi++;
					i--;
				}
				
				numGiri++;
			}
		}
		
		
		System.out.println(Arrays.toString(numEstratti));
		System.out.println("Giri eseguiti " + numGiri);
		System.out.println("Doppi trovati " + numDoppi);
	}
	
	
	///METODO 2 Estrazione
	
	public static void estrai2() {
		int numDaEstrarre = chiediNumeri();
				
		Random rand = new Random();
		
		int[] numEstratti = new int[numDaEstrarre];
		
		int contatore = 0;
		int tentativi = 0;
		
		while (contatore < numEstratti.length) {
			int numEstratto = rand.nextInt(90) + 1;

			boolean presente = false;
			
			for(int i = 0; i < contatore; i++) {
				if(numEstratti[i] == numEstratto) {
					presente = true;
					break;
				}
				tentativi++;
			}
			
			if(!presente) {
				numEstratti[contatore] = numEstratto;
				contatore++;
			}
			
		}
		
		System.out.println(Arrays.toString(numEstratti));
		System.out.println("tentativi: " + tentativi);
	}
	
	
	
	
	public static void main(String[] args) {
		//Numeri casuali
//		//MODO 1 - Math random
//		int numeroCas = (int) Math.ceil( Math.random() * 90);
//		System.out.println(numeroCas);
		
//		estrazione();
		estrai2();
		
	}
	
	
	
}
