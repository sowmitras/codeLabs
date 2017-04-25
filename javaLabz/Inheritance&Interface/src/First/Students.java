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
//5.24

interface Cal
{
    double radius=0;
    double Area(double radius);
}
public class Students implements Cal{
    
    public double Area(double radius)
    {
        return 3.14*radius*radius;
    }
    
    public static void main(String args[])
    {
        Students obj=new Students();
        double res=obj.Area(5.3);
        System.out.println("computing area using class variable"+res);
        Cal interf;
        interf=obj;
        double res1=obj.Area(5.3);
        System.out.println("computing area using class variable"+res1);
    }
    
    
}
