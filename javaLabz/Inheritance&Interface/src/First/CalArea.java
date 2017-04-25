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
//5.9
class MyData {

    public double radius;
}

public class CalArea extends MyData {

    public double CalArea(double r) {
        return 3.14 * r * r;
    }

    public static void main(String args[]) {
        CalArea num = new CalArea();
        num.radius = 10;

        double result = num.CalArea(num.radius);
        System.out.println("Area Calculated" + result);

    }

}
