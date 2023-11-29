package model;
public abstract class FaIdom {
    public static final double fajsuly = 0.8;

    public abstract double terfogat();
    
    public double suly() {
        return fajsuly * terfogat();
    }

    @Override
    public abstract String toString();
}