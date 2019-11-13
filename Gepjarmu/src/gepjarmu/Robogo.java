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
public class Robogo extends Jarmu implements KisGepjarmu{

    public Robogo(int rendszam, int aktualisSebesseg, int maxSebesseg) {
        super(aktualisSebesseg, rendszam);
        this.maxSebesseg = maxSebesseg;
    }
    
    public int maxSebesseg;


    @Override
    public boolean gyorshajtottE(int sebessegKorlat) {
        if(aktualisSebesseg>sebessegKorlat){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean haladhatitt(int sebesseg) {
        if(maxSebesseg>sebesseg){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Robogo : " + rendszam + " - " + aktualisSebesseg + "km/h";
    }
    
    
    
}
