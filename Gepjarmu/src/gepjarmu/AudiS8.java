/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gepjarmu;

/**
 *
 * @author Diak
 */
public class AudiS8 extends Jarmu{
    private boolean lezerblokkolo;

    public AudiS8(int rendszam, int aktualisSebesseg, boolean lezerblokkolo) {
        super(aktualisSebesseg, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }
    
    
    @Override
    public boolean gyorshajtottE(int sebessegKorlat) {
        if(this.lezerblokkolo) return false;
        else if(aktualisSebesseg>sebessegKorlat){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Audi: " + rendszam + " - " + aktualisSebesseg + "km/h";
    }
    
    
    
    
}
