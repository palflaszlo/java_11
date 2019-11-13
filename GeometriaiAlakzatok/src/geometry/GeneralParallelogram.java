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
public class GeneralParallelogram implements Parallelogram{

    private double a;
    private double b;
    private double alfa;

    public GeneralParallelogram(double a, double b, double alfa) {
        this.a = a;
        this.b = b;
        this.alfa = alfa;
    }
    
    
    @Override
    public double getA() {
        return a;
    }

    @Override
    public double getAlfa() {
        return alfa;
    }

    @Override
    public double getB() {
        return b;
    }
    
}
