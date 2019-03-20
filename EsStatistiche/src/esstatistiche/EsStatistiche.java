/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esstatistiche;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Padua
 */
public class EsStatistiche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner input=new Scanner(System.in);
            
            
            System.out.print("Inserire durata del test:");
            int n=input.nextInt();
            DatiCondivisi dati=new DatiCondivisi(n);
            ThGenera thGenera=new ThGenera(dati);
           /* ThConta thLeggiSpazi=new ThConta(' ',dati);
            ThConta thLeggiPunti=new ThConta('.',dati);*/
            ThSpazio thLeggiSpazi=new ThSpazio(dati);
            ThPunto thLeggiPunti=new ThPunto(dati);
            
            thGenera.start();
            thLeggiSpazi.start();
            thLeggiPunti.start();
            thGenera.join();
            thLeggiSpazi.join();
            thLeggiPunti.join();
            
            System.out.println("FINE");
            System.out.println("Spazi Inseriti:"+ dati.getSpaziIns()+ " Punti inseriti:"+dati.getPuntiIns());
            System.out.println("Spazzi letti:"+dati.getLeggiSpazi()+ " Punti letti:"+dati.getLeggiPunti());
        } catch (InterruptedException ex) {
            Logger.getLogger(EsStatistiche.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
