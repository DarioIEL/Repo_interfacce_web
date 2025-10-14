package giochi;

import java.util.Arrays;

public class Ordinamento {
	//Per ogni esercizio crea un metodo a se stante che richiamerai nel main
	
	//Dato il seguente Array inverti l'ordine degli elementi
	//[9,3,5,7,1,] -> [1,7,5,3,9]

	
	//Dato il seguente array ordinalo in modo crescente e decrescente
	// [5, 9, 11, 0, 1, 40]
	
	
	//[5, 9, 6, 10, 7, 11] carino questo da fare dopo 
	
	public static int[] esercizio1(int[] arr) {
		int[] mioArr = arr;
		int[] invArray = new int[mioArr.length];
		
		int j = 0; //contatore
		
		System.out.println(Arrays.toString(mioArr) + " Array originale");
		
		for(int i = mioArr.length - 1; i  >= 0 ; i--) {
			int temp = mioArr[i];
			invArray[j] = temp;
			j++;
		}
		
//		System.out.println(Arrays.toString(invArray) + "Array inverso");
		return invArray;
	}
	
	
	public static void esercizio1() {
		//RISOLVI QUESTO STESSO ESERCIZIO CON UN WHILE
		
		int[] mioArr = {9,3,5,7,1};
		int[] invArray = new int[mioArr.length];
		
		int j = 0; //contatore
		
		System.out.println(Arrays.toString(mioArr) + " Array originale");
		
		for(int i = mioArr.length - 1; i  >= 0 ; i--) {
			int temp = mioArr[i];
			invArray[j] = temp;
			j++;
		}
		
		System.out.println(Arrays.toString(invArray) + "Array inverso");
		
	}
	

	
	public static void esercizio2CRESC(int[] arr) {
		
		boolean ordine = true;
		
		while(ordine) {
			for(int i = 1; i < arr.length; i++ ) {
				if(arr[i] < arr[i-1]) {
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
					ordine = false;
				}
			}
			
			for(int i = 1; i < arr.length; i++ ) {
				if(arr[i] < arr[i-1]) {
					ordine = true;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void esercizio2VerDario(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1 ; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void esercizio2While(int[] arr) {
		int i = 0;
		
		while(i < arr.length - 1) {
			int j = 0;
			while(j < arr.length - 1 - i) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				j++;
			}
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	public static void esercizio2DESC() {}
	
	public static void main(String[] args) {
		int[] mioArr = {9,3,5,7,1};
		System.out.println( Arrays.toString(esercizio1(mioArr)) );
		
		int[] mioArr2 = {5, 9, 11, 0, 1};
		esercizio2CRESC(mioArr2);
		
	
		esercizio2VerDario(mioArr2);
		
		int[] mioArr3 = {5, 9, 11, 0, 1, 40};
		esercizio2While(mioArr3);
		
		int[] mioArr4 = {5, 9, 6, 10, 7, 11};
		esercizio2VerDario(mioArr4);
		
	}
}
