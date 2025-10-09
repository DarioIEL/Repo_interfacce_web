package giochi;

import java.util.Random;

public class Tombola {

	//Sviluppa il gioco della Tombola. Chiedi all'utente quanti numeri devono essere estratti. I numeri in totale sono 90. Att: non bisogna che si ripetano dei numeri
	
	public static void main(String[] args) {
		//Numeri casuali
		//MODO 1 - Math random
		int numeroCas = (int) Math.ceil( Math.random() * 90);
		System.out.println(numeroCas);
		
		//MODO 2 - Oggetto Random
		Random numRand = new Random();
		System.out.println(numRand.nextInt(90)+1); //nextInt(90) produce un numero random tra 0 e 89. Il +1 mi serve per creare un numero random tra 1 e 90
		for(int i = 0; i <= 20; i++) {
			//Qui dentro sicuramente ci saranno dei numeri doppio
			System.out.println(numRand.nextInt(90)+1); 
		}
	}
	
	
	
}
