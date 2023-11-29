package model;
import java.util.ArrayList;
import java.util.List;

public class FaIdomok {
    
    private List<FaIdom> idomok = new ArrayList<>();

    public FaIdomok() {
    }
    
    public double osszSuly() {
        double ossz = 0.0;
        for (FaIdom idom : idomok) {
            ossz += idom.suly();
        }
        return ossz;
    }

    public double osszGombSuly() {
        double ossz = 0.0;
        for (FaIdom idom : idomok) {
            if (idom instanceof Gomb) {
                ossz += idom.suly();
            }
        }
        return ossz;
    }
    
    public FaIdom minV() {
        if (idomok.isEmpty()) {
            return null;
        }
        FaIdom min = idomok.get(0);
        for (FaIdom idom : idomok) {
            if (idom.terfogat() < min.terfogat()) {
                min = idom;
            }
        }
        return min;
    }

    public FaIdom maxV() {
        if (idomok.isEmpty()) {
            return null;
        }
        FaIdom max = idomok.get(0);
        for (FaIdom idom : idomok) {
            if (idom.terfogat() > max.terfogat()) {
                max = idom;
            }
        }
        return max;
    }
    
    public void run() {

    }
    
    public void addIdom(FaIdom idom) {
        idomok.add(idom);
    }
}