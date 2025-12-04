package lezione10_ENUM;

public enum Operazioni {
	//In questo caso faccio delle operazioni con i metodi 
	SOMMA{
		public double calcola(double x, double y) {
			return x + y;
		}
	},
	
	PRODOTTO{
		public double calcola (double x, double y) {
			return x * y;
		}
	};
	
	//devo dichiarare il metodo abstract calcola per "obbligare" ogni ENUM a sviluppare il suo metodo specifico
	public abstract double calcola(double x, double y);
}
