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
public abstract class Jarmu {
    public int aktualisSebesseg;
    protected int rendszam;

    public Jarmu(int aktualisSebesseg, int rendszam) {
        this.aktualisSebesseg = aktualisSebesseg;
        this.rendszam = rendszam;
    }
    
    public abstract boolean gyorshajtottE(int sebessegKorlat);

    @Override
    public String toString() {
        return rendszam + " - " + aktualisSebesseg + " km/h";
    }
    
}
