package gestionePokemon.pokemonConcreti;

import gestionePokemon.tipi.TipoAcqua;

public class Squirtle extends TipoAcqua{
	
	private String nomeAttacco = "Pistolacqua";
	private int potenzaBase = 100;

	public Squirtle(String nome, int hp, int livello) {
		super(nome, hp, livello);
	}

	
	@Override
	public void attacca() {
		System.out.println("Sto attaccando con " + this.nomeAttacco + " danno: " + calcolaDanno(potenzaBase));
	}

	@Override
	public String toString() {
		return "Squirtle [tipologia=" + tipologia + ", moltiplicatore=" + moltiplicatore + ", getNome()=" + getNome()
				+ ", getHp()=" + getHp() + ", getLivello()=" + getLivello() + "]";
	}
	

}
