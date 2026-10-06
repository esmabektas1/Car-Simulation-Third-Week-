/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;


public class Car {
    
   
    private String plateNumber;
    private String model;
    private double mileage;
    private double fuelLevel;
    private double tankCapacity;

    
    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0.0; // Başlangıç kilometresi 0
        this.tankCapacity = tankCapacity;

        
        if (fuelLevel > tankCapacity) {
            this.fuelLevel = tankCapacity;
        } else {
            this.fuelLevel = fuelLevel;
        }
    }

    
    public void drive(double km) {
        double requiredFuel = km / 10.0;

        if (requiredFuel > this.fuelLevel) {
            System.out.println("Not enough fuel for this trip!");
        } else {
            this.fuelLevel -= requiredFuel;
            this.mileage += km;
            System.out.println("Driving " + km + " km... Successfully completed.");
        }
    }

   
    public void refuel(double amount) {
        if (this.fuelLevel + amount > this.tankCapacity) {
            this.fuelLevel = this.tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        } else {
            this.fuelLevel += amount;
            System.out.println("Refueling " + amount + " liters... Added successfully.");
        }
    }

   
    public void checkStatus() {
        System.out.println("Car: " + this.model + " [" + this.plateNumber + "]");
        System.out.println("Current Mileage: " + this.mileage + " km");
        System.out.println("Current Fuel Level: " + this.fuelLevel + " / " + this.tankCapacity + " L");

       
        if (this.fuelLevel < (0.10 * this.tankCapacity)) {
            System.out.println("Low fuel warning!");
        }
        System.out.println("----------------------------------------");
    }
}


    

