package Lezione8_Polimorfismo;

//Dichiaro questa classe abstract per avere un modello comune a tutte le classi che la estendono.
//Posso adesso implementare dei metodi che la classe figlia sarà obbligata a specificare.
//Con abstract non posso creare degli oggetti concreti di tipo FormaGeometrica.
public abstract class FormaGeometrica {
	
	//Di solito usiamo protected per le proprietà comuni. In questo modo tutte le classi figlie possono accedere direttamente a questa prop che ha uno scope di package
	protected String colore;

	public FormaGeometrica(String colore) {
		this.colore = colore;
	}
	

	public void descrivi() {
		System.out.println("Sono una forma di colore: " + colore);
	}
	
	//Nel momento in cui dichiaro un metodo abstract obbligo tutte le sottoclassi ad implementare il metodo abstract appena dichiarato
	
	public abstract double calcolaArea();
	public abstract double calcolaPerimetro();
	

}
