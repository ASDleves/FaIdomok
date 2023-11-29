
package faidom;

import model.FaIdom;
import model.FaIdomok;
import model.Gomb;
import model.Hasab;

public class FaidomProgram {

    public static void main(String[] args) {
         FaIdomok faidomok = new FaIdomok();
        
        
        Gomb gomb1 = new Gomb(3);
        Gomb gomb2 = new Gomb(4);
        Hasab hasab1 = new Hasab(1, 2, 3);
        Hasab hasab2 = new Hasab(2, 4, 6);
        
        faidomok.addIdom(hasab1);
        faidomok.addIdom(hasab2);
        faidomok.addIdom(gomb1);
        faidomok.addIdom(gomb2);
        
        FaIdom minTérfogatIdom = faidomok.minV();
        FaIdom maxTérfogatIdom = faidomok.maxV();

        System.out.println("Legkisebb térfogatú Idom: " + minTérfogatIdom);
        System.out.println("Legnagyobb térfogatú Idom: " + maxTérfogatIdom);
    }
    
}
