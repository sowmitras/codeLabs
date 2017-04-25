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
//5.13
class MySuperPublic {

    public String name = "surbhi";
}

public class MySubPublic extends MySuperPublic {

    public void displayName() {
        System.out.println("your name is:" + name);
    }

}
