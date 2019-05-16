/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 *
 * @author malud0519
 */
public class Truck extends Vehicle {
   private double gas, distance;
   private double temp;
    
    public Truck() {
        super();
    }
   
    public double getDistance(double gs) {       
        gas = gs;
        temp = 100/14.1;
        distance = temp * gs;
        return distance;
    }
    public String getName() {
        return "Truck = ";
    }
}
