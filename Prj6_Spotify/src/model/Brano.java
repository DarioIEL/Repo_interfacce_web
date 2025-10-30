package model;

public class Brano implements Comparable<Brano> {

	private String titolo;
	private String autore;
	private double durata;
	
	public Brano(String titolo, String autore, double durata) {
		this.titolo = titolo;
		this.autore = autore;
		this.durata = durata;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public double getDurata() {
		return durata;
	}

	public void suona() {
		System.out.println("Sto suonando il seguente brano " + this.titolo + " - " + this.autore);
	}

	@Override
	public int compareTo(Brano b) {
		//il metodo compare to restituisce 0 quando gli oggetti paragonati sono identici. Un numero != 0 quando sono diversi tra loro
		
		int confrontoAutore = this.autore.compareTo(b.autore);
		if(confrontoAutore == 0) {
			int confrontoTitolo = this.titolo.compareTo(b.titolo);
			if(confrontoTitolo == 0) {
				return Double.compare(this.durata, b.durata); //compare restituisce 0 se ho 2 double uguali, un numero != 0 se sono differenti
			}else {
				return confrontoTitolo;
			}
		}
		return confrontoAutore;
	}

	

}
