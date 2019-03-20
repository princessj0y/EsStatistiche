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
public class ThConta extends Thread{
     private DatiCondivisi ptrdati;
     private char assegna;
    
    public ThConta(char assegnaChar,DatiCondivisi dati) {
        assegna=assegnaChar;
        ptrdati=dati;
    }
    
    public void run() {
        for (int i=0;i<ptrdati.getGeneraN();i++) {
            if(ptrdati.getLeggiChar()==assegna) {
                ptrdati.spaziLetti();
            }  
            if(ptrdati.getLeggiChar()==assegna) {
                ptrdati.puntiLetti();
            } 
        }
    }
}
