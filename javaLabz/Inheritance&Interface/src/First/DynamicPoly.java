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
//5.28

class A
{
    static void calc(double x)
    {
        System.out.println("square of value:"+(x*x));
    }
}
class B extends A
{
    static void calc(double x)
    {
        double y=10;
        System.out.println("area of rctangle:"+(x*y));
        
    }
}
public class DynamicPoly {
    public static void main(String args[])
    {
        A a=new B();
        a.calc(10);
        B b=new B();
        b.calc(5);
    }
    
}
