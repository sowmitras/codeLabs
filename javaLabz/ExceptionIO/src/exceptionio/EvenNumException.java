/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionio;

/**
 *
 * @author surbhi_khare
 */
//6.2
public class EvenNumException extends Exception{

    EvenNumException(String str) {
        super(str);
    }
    
    public static void main(String args[])
    {
        try
        {
          
            int a[]={0,8,50,9};
            int var;
            
            for(int i=0;i<a.length;i++)
            {
                var=a[i]%2;
                if(var==0)
                {
                    System.out.println(a[i]+" "+"is an even number");
                }
                else
                {
                    EvenNumException exp=new EvenNumException(a[i]+" "+"is odd number");
                    throw exp;
                }
            }
        }catch(EvenNumException e)
        {
            System.out.println("Exception is"+e);
        }
    }
    
}
