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
public class Pogacsa extends Peksutemeny{

    public Pogacsa(double alapAr, double mennyiseg) {
        super(alapAr, mennyiseg);
    }

   
    @Override
    public void megkostol(){
        super.mennyiseg *= 0.5;
    }

    @Override
    public String toString() {
        return "Pogacsa: " + super.toString();
    }
    
    
}
