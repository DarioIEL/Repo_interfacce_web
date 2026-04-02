package lezione16_Polimorfismo;

public class Cerchio extends FormaGeometrica {
    private double raggio;

    public Cerchio(String colore, double raggio) {
        super(colore);
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    public double calcolaDiametro() {
        return raggio * 2;
    }
}
