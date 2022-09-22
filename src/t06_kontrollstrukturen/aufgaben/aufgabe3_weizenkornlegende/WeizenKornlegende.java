package t06_kontrollstrukturen.aufgaben.aufgabe3_weizenkornlegende;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class WeizenKornlegende {
    public static void main(String[] args) {
        double summe=0;
        double box=0.5;
        for (int i=1; i<65;i++){
            box= box*2;
            summe = summe +box;
            System.out.print(i+ " => box: " + (long) box);
            System.out.println(",  summe: " + (long) summe);
        }

        System.out.println("\nWeight: " + summe*0.05/1000 + " Kg");
    }
}
