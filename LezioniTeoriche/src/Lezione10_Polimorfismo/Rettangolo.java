package lezione16_Polimorfismo;

public class Rettangolo extends FormaGeometrica {
    private double base;
    private double altezza;

    public Rettangolo(String colore, double base, double altezza) {
        super(colore);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}
