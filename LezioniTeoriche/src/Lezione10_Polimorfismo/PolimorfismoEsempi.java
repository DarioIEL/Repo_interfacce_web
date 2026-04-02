package lezione16_Polimorfismo;

public class PolimorfismoEsempi {
    public static void main(String[] args) {
        FormaGeometrica[] forme = {
            new Cerchio("rosso", 5),
            new Rettangolo("blu", 4, 6),
            new Triangolo("verde", 8, 3),
            new Cerchio("giallo", 2)
        };

        double totaleArea = 0;
        System.out.println("=== DEMO POLIMORFISMO ===\n");

        for (FormaGeometrica forma : forme) {
            forma.descrivi();
            System.out.printf("Area: %.2f\n", forma.calcolaArea());
            totaleArea += forma.calcolaArea();
            System.out.println();
        }

        System.out.println("Totale area: " + totaleArea);

        // Casting dinamico
        if (forme[0] instanceof Cerchio) {
            Cerchio c = (Cerchio) forme[0];
            System.out.println("Diametro cerchio: " + c.calcolaDiametro());
        }
    }
}
