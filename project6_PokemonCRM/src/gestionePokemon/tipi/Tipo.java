package gestionePokemon.tipi;

import gestionePokemon.Pokemon;

public abstract class Tipo extends Pokemon {

	protected String tipologia;
	protected double moltiplicatore;
	
	public Tipo(String nome, int hp, int livello, String tipologia, double moltiplicatore) {
		super(nome, hp, livello);
		this.tipologia = tipologia;
		this.moltiplicatore = moltiplicatore;
	}
	
	//metodo condiviso 
	public double calcolaDanno(int potenzaBase) {
		return potenzaBase * moltiplicatore;
	}

}
