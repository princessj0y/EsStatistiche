/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esstatistiche;

/**
 *
 * @author Padua
 */
public class ThPunto extends Thread {
       private DatiCondivisi ptrdati;
    
    public ThPunto(DatiCondivisi dati) {
        ptrdati=dati;
    }
    
    public void run() {
        for (int i=0;i<ptrdati.getGeneraN();i++) {
            if(ptrdati.getLeggiChar()=='.') {
                ptrdati.puntiLetti();
            }      
        }
    } 
}
