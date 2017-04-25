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
//5.16
class SuperClass {

    String name = "surbhi";
    String desg = "programmmer";

    public void show() {
        System.out.println("Name:" + name);
        System.out.println("Designation:" + desg);
    }
}

public class SubClass extends SuperClass {

    String address = "pune";

    public void show() {
        System.out.println("city:" + address);
    }

    public static void main(String args[]) {
        SuperClass obj1 = new SuperClass();
        SubClass obj2 = new SubClass();
        obj1.show();
       // obj1 = obj2;
        obj2.show();

    }

}
