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
//5.18
class Vehicle1 {

    public double calculate() {
        double speed, distance, time;
        distance = 150;
        time = 2.5;
        speed = distance / time;
        return speed;
    }
}

public class Car1 extends Vehicle1 {

    public double calculate() {
        double x;
        x = super.calculate();
        System.out.println("Speed of the vehicle is:" + x + "kilometer per hour");
        return x;
    }

    public static void main(String args[]) {
        Car1 c = new Car1();
        c.calculate();
    }

}
