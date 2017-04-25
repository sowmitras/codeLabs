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
//5.26

interface Set
{
    int red=1;
    int blue=2;
    int green=3;
}

 class SetImpl implements Set
{
    void select(int colour)
    {
        switch(colour)
        {
         case red:
        System.out.println("Red is selected");
        break;
        
        case blue:
        System.out.println("Blue is selected");
        break;
        
        case green:
        System.out.println("Green is selected");
        break;
        
        }
       
    }
}
public class Itest {
    
public static void main(String args[])
{
    SetImpl obj=new SetImpl();
    obj.select(1);
    obj.select(2);
    obj.select(3);
}
    
}
