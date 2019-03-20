/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esstatistiche;

import java.util.Random;

/**
 *
 * @author Padua
 */
public class ThGenera extends Thread {

    private Random rndm = new Random();
    private int n;
    private DatiCondivisi ptrdati;

    public ThGenera(DatiCondivisi dati) {
        ptrdati = dati;
    }

    public void run() {
        for (int i = 0; i < ptrdati.getGeneraN(); i++) {
            n = rndm.nextInt(28);
            ptrdati.prendiChar(n);
            
            char leggi=ptrdati.getLeggiChar();
            if (leggi == ' ') {
                ptrdati.spaziInseriti();
            }
            if (leggi == '.') {
                ptrdati.puntiInseriti();
            }
        }
    }
}
