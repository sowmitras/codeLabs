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
//5.12
public class MySubs extends MySup {

    public double calArea(double r) {
        return 3.14 * r * r;
    }

    public static void main(String args[]) {
        MySubs num = new MySubs();
        num.radius = 10;
        double Result = num.calArea(num.radius);
        System.out.println("Area Calculated" + Result);

    }

}
