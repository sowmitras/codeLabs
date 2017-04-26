/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionio;

import java.io.*;

/**
 *
 * @author surbhi_khare
 */
//6.16
public class MyConsole {
	public static void main(String args[]) {
		Console cns=System.console();
		char pw[];
		System.out.println("Using readPassword() method");
		pw=cns.readPassword("Enter your Password: ");
		System.out.println("Your password is: ");
		for(char c:pw)
		cns.format("%c ",c);
		cns.format("\n");
		System.out.println("Using readLine() method");
		String name;
		for(int i=1;i<=100;i++)
		{
		name=cns.readLine("Enter your password "+i+" : ");
		cns.format("Your password is: %s\n",name);
		}
	}
}




//        Console cns = System.console();
//
//        char pw[];
//        
//        System.out.println("using readpassword() method");
//        
//        pw = cns.readPassword("Enter your password ");
//        
//        System.out.println("your password is:" + pw);
//
//        for (char c : pw) {
//            cns.format("%c", c);
//        }
//        cns.format("\n");
//        System.out.println("using readline() method");
//
//        String name;
//        for (int i = 1; i <= 100; i++) {
//            name = cns.readLine("Enter your password" + i + " : ");
//            cns.format("your password is:%s\n", name);
//        }