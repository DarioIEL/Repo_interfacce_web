package Lezione8_Polimorfismo;

//La classe Rettangolo (classe concreta) può estendere solo una superclasse
public class Rettangolo extends FormaGeometrica {
	
	public double base;
	public double altezza;
	
	
	public Rettangolo(String colore, double base, double altezza) {
		super(colore); //Qui sto invocando il costruttore di FormaGeometrica e sono obbligato 
		this.altezza = altezza;
		this.base = base;
	}


	//Obbligato a implementare il metodo calcolaArea() sto applicando il CONTRATTO
	@Override
	public double calcolaArea() {
		double area = this.base * this.altezza;
		return area;
	}


	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
