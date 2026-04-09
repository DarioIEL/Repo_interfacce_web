package gestionePokemon.main;

import java.util.ArrayList;
import java.util.List;

import gestionePokemon.Pokemon;
import gestionePokemon.pokemonConcreti.Squirtle;

public class Pokedex {
	public static void main(String[] args) {
		
		Pokemon poke1 = new Squirtle("Gennaro", 100, 1);
		
		poke1.attacca();
		System.out.println(poke1);

		
		List<Pokemon> mieiPokemon = new ArrayList<>();
		mieiPokemon.add(poke1);		
		
		mieiPokemon.forEach(pokemon -> pokemon.attacca()); 
}
}
