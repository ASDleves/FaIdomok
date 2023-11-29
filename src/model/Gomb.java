
package model;

public class Gomb extends FaIdom {
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double terfogat() {
        return (4.0 / 3.0) * Math.PI * Math.pow(sugar, 3);
    }

    @Override
    public String toString() {
        return "Gomb{sugar=" + sugar + "}"+"térfogata = "+ terfogat();
    }
}
    
