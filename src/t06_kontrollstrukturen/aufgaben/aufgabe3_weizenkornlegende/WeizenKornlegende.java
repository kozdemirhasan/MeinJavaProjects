package t06_kontrollstrukturen.aufgaben.aufgabe3_weizenkornlegende;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class WeizenKornlegende {
    public static void main(String[] args) {
        long summe=1;
        long box=1;
        for (int i=2; i<64;i++){
            box= box*2;
            summe = summe +box;
            System.out.print("box: " + box);
            System.out.println(",  summe: " + summe);
        }

        System.out.println(summe*0.05/1000);
    }
}
