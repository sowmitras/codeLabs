/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;

/**
 *
 * @author surbhi_khare
 */
//5.4
class Car extends Vehicle {

    public void drive() {
        System.out.println("Driving a car");
    }
}

class Vehicle {

    public void start() {
        System.out.println("Starting a vehicle");
    }
}
