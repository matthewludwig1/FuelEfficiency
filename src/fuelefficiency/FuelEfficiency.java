/*
    Matt Ludwig
    2019-05-16
    This program implements polymorphism 
 */

package fuelefficiency;

/**
 *
 * @author malud0519
 */
import javax.swing.*;
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double fuel;
        Vehicle vehicles[] = new Vehicle[4];
        vehicles[0] = new Car();
        vehicles[1] = new Truck();
        vehicles[2] = new HybridCar();
        vehicles[3] = new Motorcycle();
        
        fuel = Double.parseDouble(JOptionPane.showInputDialog("Fuel Efficiencies for Vehicles: "
                + "Enter the amount of fuel: "));
        
        System.out.println("On " + fuel + "L of gas, the vehicles can drive: " + "\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(vehicles[i].getName() + vehicles[i].getDistance(fuel));  // inputs 50 litres into each vehicle's method getDistance()
        }
    
    }
    
}
