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
public class Vehicle { //optional: abstract class, as the Vehicle object does not need to be instantiated
    private double gas;
    private double distance;
    
    public double getDistance(double gs) {  // needs to be overridden by subclasses
        gas = gs;
        distance = 0;
        // formula here
        return distance;
    }
    public String getName() {
        return null;
    }
    
}
