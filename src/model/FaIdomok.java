package model;
import java.util.ArrayList;
import java.util.List;

public class FaIdomok {
    
    private FaIdom[] idomok;

    public FaIdomok() {
        idomok = new FaIdom[4];
        
        
        idomok[0] = new Gomb(3);
        idomok[1] = new Gomb(4);
        idomok[2] = new Hasab(1, 2, 3);
        idomok[3] = new Hasab(2, 4, 6);
        
    }
    public void run() {
        System.out.println("Idomok listaja:");
        for (FaIdom idom : idomok) {
            System.out.println(idom);
        }
        
        double osszGombSuly = osszGombSuly();
        System.out.println("Az osszes gomb sulya: " + osszGombSuly);
        
        double osszIdomSuly = osszSuly();
        System.out.println("Az osszes idom sulya: " + osszIdomSuly);
        
        FaIdom minIdom = minV();
        System.out.println("A legkisebb terfogatu idom: " + minIdom);
        
        FaIdom maxIdom = maxV();
        System.out.println("A legnagyobb terfogatu idom: " + maxIdom);
    }
    public FaIdom minV() {
        FaIdom min = null;
        for (FaIdom idom : idomok) {
            if (min == null || idom.suly() < min.suly()) {
                min = idom;
            }
        }
        return min;
    }

    public FaIdom maxV() {
        FaIdom max = null;
        for (FaIdom idom : idomok) {
            if (max == null || idom.suly() > max.suly()) {
                max = idom;
            }
        }
        return max;
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
    
    

}