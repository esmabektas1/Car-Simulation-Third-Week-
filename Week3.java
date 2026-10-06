/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3;


public class Week3 {
    

   
    public static void main(String[] args) {
        
        Car myCar = new Car("34ABC123", "Toyota Corolla", 15.0, 50.0);

        System.out.println("=== Initial Status ===");
        myCar.checkStatus();

        
        System.out.println("Driving 120 km...");
        myCar.drive(120);
        myCar.checkStatus();

        
        System.out.println("Driving 50 km (Edge Case: Insufficient Fuel)...");
        myCar.drive(50);
        myCar.checkStatus();

       
        System.out.println("Refueling 20 liters...");
        myCar.refuel(20);
        myCar.checkStatus();

         
        System.out.println("Refueling 40 liters (Edge Case: Overfilling Tank)...");
        myCar.refuel(40);
        myCar.checkStatus();
    
      
    }
    
}
