package lezione02_statement;

public class Operatori {
	public static void main(String[] args) {
		// Operatori matemtici + - */
		
		// % resto della divisione o modulo
		int resto = 12 % 6;
		System.out.println("Il resto è " + resto);
		
		int resto2 = 12 % 5;
		System.out.println("Il resto è " + resto2);
		
		//Operatori di confronto o relazionali -> producono sempre un boolean
		// == (uguale a)
		// != (diverso)
		// > (maggiore) < (minore) >= (maggiore uguale) <= (minore uguale)
		
		int i1 = 5;
		int i2 = 6;
		
		boolean c1 = (i1 == i2); //false
		boolean c2 = (i1 != i2); //true
		boolean c3 = (i1 > i2); //false
		boolean c4 = (i1 < i2); //true
		
		System.out.println(c4);
		
		
		//Operatori di assegnazione
		// = (assegnazione);  += (assegnazione con somma); *= (assegnazione con prodotto) ; /= (assegnazione con divisione); -= (assegnazione con sottrazione
		
		int num1 = 10;
		int num2 = 6;
		
//		num1 += num2; //num1 = num1 + num2
//		System.out.println(num1); //15
		
//		num1 -= num2;
//		System.out.println(num1); //4
//		System.out.println(num2); //6
		
//		num1*=num2;
//		System.out.println(num1);
		
		num1 /= num2;
		System.out.println(num1); //1
		
		
		//Operatori di incremento (++) e decremento (--). Aumentano o diminuiscono il valore delle variabili di 1 
		
		num1++;
		System.out.println(num1);
		
		num1--;
		System.out.println(num1);
		
		//Se posizionati prima della variabile si chiamano operatori di pre, se posizionati dopo si chiamano operatori di post
		
		int nuovoNum = 9;
		int b;
		
		b = nuovoNum++;
		System.out.println(b); //9 perché incremento solo dopo la lettura
		
		
		b = ++nuovoNum;
		System.out.println(b); //b vale 11 perché dopo la lettura vale 10 poi lo incremento prima
		
		
		// Operatori Logici, anche questi producono un valore boolean. Servono a mettere insieme più condizioni e confronti. Tabella delle verità 
		
		
		// && AND logico
		// || OR logico
		// !  NOT logico
		
	
		
		
		
		
	}
}
