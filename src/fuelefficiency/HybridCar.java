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
public class HybridCar extends Vehicle {
    private double gas, distance, temp;
    
    public HybridCar() {
        super();
    }
    
    public double getDistance(double gs) {
        gas = gs;
        temp = 100 /3.8;
        distance = temp * gas;
        return distance;
    }
    
    public String getName() {
        return "Hybrid Car = ";
    }
}
