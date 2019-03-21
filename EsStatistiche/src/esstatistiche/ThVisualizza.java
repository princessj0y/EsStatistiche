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
public class ThVisualizza extends Thread{
    private DatiCondivisi ptrdati;
    private int  numSpaziInseriti, numPuntiInseriti, numSpaziLetti, numPuntiLetti ;
    
    public ThVisualizza (DatiCondivisi dati) {
        ptrdati=dati;
        numSpaziInseriti=0;
        numPuntiInseriti=0;
        numSpaziLetti=0;
        numPuntiLetti=0;
        
    }
    
    public void run() {
        if (numSpaziInseriti!=ptrdati.getSpaziIns()) {
            numSpaziInseriti=ptrdati.getSpaziIns();
            System.out.println("Spazi inseriti:"+numSpaziInseriti);
        }
        
        if (numPuntiInseriti!=ptrdati.getPuntiIns()) {
            numPuntiInseriti=ptrdati.getPuntiIns();
            System.out.println("Punti inseriti:"+numPuntiInseriti);
        }
        
        if (numSpaziLetti!=ptrdati.getLeggiSpazi()) {
            numSpaziLetti=ptrdati.getLeggiSpazi();
            System.out.println("Punti letti:"+numSpaziLetti);
        }
        
        if (numPuntiLetti!=ptrdati.getLeggiPunti()) {
            numPuntiLetti=ptrdati.getLeggiPunti();
            System.out.println("Punti letti:"+numPuntiLetti);
        }
    }
}
