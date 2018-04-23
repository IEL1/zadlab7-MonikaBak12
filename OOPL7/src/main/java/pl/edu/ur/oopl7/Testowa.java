/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import java.util.Scanner;

/**
 *
 * @author Monika
 */
public class Testowa {
     Scanner scanner = new Scanner(System.in);
    private double x;
    private double y;
    private double z;
    
    private Punkt2D random2D;
    private Punkt2D norandom2D;
    private Punkt3D random3D;
    private Punkt3D norandom3D;
    
    private Punkt2D[] tablica2D = new Punkt2D[100];
    private Punkt3D[] tablica3D = new Punkt3D[100];
            
    public Testowa(){
        System.out.print("X: ");
        x = scanner.nextDouble();
        System.out.print("Y: ");
        y = scanner.nextDouble();
        System.out.print("Z: ");
        z = scanner.nextDouble();
        
        random2D = new Punkt2D();
        random2D.random();
        
        norandom2D = new Punkt2D(x,y);
        
        random3D = new Punkt3D();
        random3D.random();
        
        norandom3D = new Punkt3D(x,y,z);
    }
    
    public void test2D(){
        System.out.println("2D random");
        System.out.println("---------");
        System.out.println(random2D.toString());
        
        System.out.println("2D norandom");
        System.out.println("---------");
        System.out.println(norandom2D.toString());
    }
    
    public void test3D(){
        System.out.println("3D random");
        System.out.println("---------");
        System.out.println(random3D.toString());
        
        System.out.println("3D norandom");
        System.out.println("---------");
        System.out.println(norandom3D.toString());
    }
    
    public void tablica2D(){
        for(int i=0; i<100;i++){
            tablica2D[i] = new Punkt2D();
            tablica2D[i].random();
        }
    }
    
    public void tablica3D(){
        for(int i=0; i<100;i++){
            tablica3D[i] = new Punkt3D();
            tablica3D[i].random();
        }
    }
    
    public void testCO(){
        for (int i=0; i<100; i++){
            for (int j=0; j<100; j++){
                if( (tablica2D[i].x == tablica3D[j].x) && (tablica2D[i].y == tablica3D[j].y) )
                    System.out.println(i+1 + " Współrzędne punktu 2D z " + j+1 + ". punktem 3D (" + tablica2D[i].toString() + ")");
            }
        }
    }

    void test2D() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
