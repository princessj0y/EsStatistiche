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
public class DatiCondivisi {
    private int leggiPunti,leggiSpazi,spaziIns,puntiIns,generaN;
    private char [] buffer={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ','.'};
    private char leggiChar;        
    
    
    public DatiCondivisi(int n) {  
        this.leggiPunti = 0;
        this.leggiSpazi = 0;
        this.spaziIns = 0;
        this.puntiIns = 0;
        this.generaN=n;
    }

    public int getGeneraN() {
        return generaN;
    }

    public void setGeneraN(int generaN) {
        this.generaN = generaN;
    }

    public char getLeggiChar() {
        return leggiChar;
    }

    public void setLeggiChar(char leggiChar) {
        this.leggiChar = leggiChar;
    }

    public int getLeggiPunti() {
        return leggiPunti;
    }

    public int getLeggiSpazi() {
        return leggiSpazi;
    }

    public int getSpaziIns() {
        return spaziIns;
    }

    public int getPuntiIns() {
        return puntiIns;
    }
    
    
    public synchronized void  prendiChar(int p) {
        leggiChar=buffer[p];
    }
    
    public synchronized void spaziInseriti()  {
        spaziIns++;
    }
    public synchronized void puntiInseriti() {
        puntiIns++;
    }
    
    public synchronized void spaziLetti() {
        leggiSpazi++;
    }
    public synchronized  void puntiLetti() {
        leggiPunti++;
    }
    
}
