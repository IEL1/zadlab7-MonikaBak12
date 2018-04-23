/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import java.util.Random;

/**
 *
 * @author Monika
 */
public class Punkt3D {
     public double z;
    double x;
    double y;

    public Punkt3D() {
         int x = 0;
         int y = 0;
    }

    public Punkt3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void random(){
        Random losowe = new Random();
        x = (-10) + (10 - (-10)) * losowe.nextDouble();
        y = (-10) + (10 - (-10)) * losowe.nextDouble();
        z = (-10) + (10 - (-10)) * losowe.nextDouble();
    }

    @Override
    public String toString() {
        return "Współrzędne punktu 3D:\nX = "  + Double.toString(x) + 
                ",\nY= " + Double.toString(y) + ",\nZ= " + Double.toString(z);
    }
    
}
