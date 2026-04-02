package lezione16_Polimorfismo;

public abstract class FormaGeometrica {
    protected String colore;

    public FormaGeometrica(String colore) {
        this.colore = colore;
    }

    public abstract double calcolaArea();

    public void descrivi() {
        System.out.println("Sono una forma di colore " + colore);
    }
}
