package model;

import java.util.Date;

public class Cambio {
	static int contatore = 0;
	int id;
	double importo; //importo in Euro
	Date data;

	public Cambio(double importo) {
		this.id = contatore++;
		this.importo = importo;
		this.data = new Date();
	}
	
	
}
