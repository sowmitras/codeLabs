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
//5.27
public class StaticPoly {
    void product(int x,int y)
    {
        System.out.println("product of two number"+(x*y));
    }
    void product(int x,int y,int z)
    {
        System.out.println("product of two number"+(x*y*z));
    }
    public static void main(String args[])
    {
        StaticPoly obj=new StaticPoly();
        obj.product(5, 6);
        obj.product(8,8,5 );
    }
    
}
