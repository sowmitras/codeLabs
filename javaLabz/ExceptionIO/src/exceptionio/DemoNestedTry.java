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
//6.4
public class DemoNestedTry {
    public static void main(String args[])
    {
       try
       {
           int z,x=10,y;
           
           int k[]=new int[10];
          for(int i=0;i<args.length;i++)
          {
              System.out.println("value:"+args[i]);
          }
          try
          {
              for(int j=0;j<args.length;j++)
              {
                  k[j]=Integer.parseInt(args[j]);
                  y=x/k[j];
                  System.out.println(y);
              }
              
          }catch(ArithmeticException e)
          {
              System.out.println("Exception is:"+e);
              System.out.println("value is divided by zero,which is not allowed");
          }
       }
       catch(Exception e1)
       {
           System.out.println("Exception is"+e1);
       }
    }
    
}
