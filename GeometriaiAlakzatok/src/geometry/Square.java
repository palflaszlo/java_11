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
public class Square implements Rectangle, Rhombus{
    private double a;

    public Square(double a) {
        this.a = a;
    }
    
    public double getA(){
        return a;
    }
    public double getAlfa(){
        return 90;
    }
    @Override
    public double getB(){
        return a;
    }
    
    @Override
    public String toString(){
        return "Square[" + "a" + a +"]";
    }
}
