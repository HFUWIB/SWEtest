package Übung1;

import java.util.ArrayList;
 
public class Übung1 {
 
     
 public static void main(String[]args){
        
        ArrayList<Kunde> bl = new ArrayList<>();
        
        Kunde k1 = new Kunde();
        k1.kundenNr = 105563;
        k1.vorname = "Peter";
        k1.name = "Rittmann";
        k1.lieferadresse = "Lehringstra�e 5, 75365 Calw";
        bl.add (k1);
        
        Kunde k2 = new Kunde();
        k2.kundenNr = 105564;
        k2.vorname = "Franz";
        k2.name = "Hauser";
        k2.lieferadresse = "Marktplatz 5, 78120 Furtwangen";
        bl.add (k2);
        
        Kunde k3 = new Kunde();
        k3.kundenNr = 105565;
        k3.vorname = "Klaus";
        k3.name = "Ritter";
        k3.lieferadresse = "Hauptstra�e 12, 78120 Furtwangen";
        bl.add (k3);
        
        Kunde k4 = new Kunde();
        k4.kundenNr = 105566;
        k4.vorname = "Michael";
        k4.name = "Wagner";
        k4.lieferadresse = "Biegerstra�e 10, 71063 Sindelfingen";
        bl.add (k4);
        


        
       
        for (Kunde k : bl){
            System.out.println(k.kundenNr+ " |" + " " + k.vorname + " " + k.name + " " + " | " + k.lieferadresse);
        }
    }   
}    