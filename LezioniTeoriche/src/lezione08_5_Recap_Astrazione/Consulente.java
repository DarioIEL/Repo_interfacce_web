package lezione10_Recap_Astrazione;

import java.util.Date;

public class Consulente extends Dipendente{

	private int oreLavorate;
	private double bonus;
	

	public Consulente(String nome, String cognome, String codFisc, Date dataAssunzione) {
		super(nome, cognome, codFisc, dataAssunzione);
	}


	public Consulente(String nome, String cognome, String codFisc, Date dataAssunzione, int oreLavorate, double bonus) {
		super(nome, cognome, codFisc, dataAssunzione);
		this.oreLavorate = oreLavorate;
		this.bonus = bonus;
	}
	
	


	public void setOreLavorate(int oreLavorate) {
		this.oreLavorate = oreLavorate;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	@Override
	public double calcolaStipendio() {
		if(oreLavorate > 0 && bonus > 0) {
			double stipendioOrarioBonus = (oreLavorate * 25) * bonus;
			return stipendioBase + stipendioOrarioBonus;
		}
		return stipendioBase;
	}

	//Questo metodo può essere utilizzato solo da un oggetto di tipo Consulente e non Dipendente
//	public double calcolaStipendio(int oreLavorate, double bonus) {
//		if(oreLavorate > 0 && bonus > 0) {
//			double stipendioOrarioBonus = (oreLavorate * 25) * bonus;
//			return stipendioBase + stipendioOrarioBonus;
//		}
//		return stipendioBase;
//	}


	
	
	
}
