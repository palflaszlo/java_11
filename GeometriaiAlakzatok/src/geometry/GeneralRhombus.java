/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author Diak
 */
public class GeneralRhombus implements Rhombus{
    public double a;
    public double alfa;

    public GeneralRhombus(double a, double alfa) {
        this.a = a;
        this.alfa = alfa;
    }

    public double getA() {
        return a;
    }

    public double getAlfa() {
        return alfa;
    }

    @Override
    public String toString() {
        return "Rhombus[" + "a=" + a + ", alfa=" + alfa + "]";
    }
    
}
