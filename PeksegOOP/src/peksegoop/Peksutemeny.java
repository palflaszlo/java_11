/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peksegoop;

/**
 *
 * @author Diak
 */
public abstract class Peksutemeny implements Arlap{

    private double alapAr;
    protected double mennyiseg;

    public Peksutemeny(double alapAr, double mennyiseg) {
        this.alapAr = alapAr;
        this.mennyiseg = mennyiseg;
    }
    
    
    @Override
    public double mennyibeKerul() {
        return alapAr * mennyiseg;
    }
    
    public abstract void megkostol();

    @Override
    public String toString() {
        return String.format("%f db - %f Ft", this.mennyiseg, this.mennyibeKerul());
    }
    
    
}
