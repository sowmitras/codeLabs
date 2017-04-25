package com.multi;

public class HashcodeDemo {

	public static void main(String[] args) {

		HashcodeDemo obj=new  HashcodeDemo();
		
		HashcodeDemo obj1=new  HashcodeDemo();
		
		
		int hashcode=obj.hashCode();
		
		System.out.println("hashcode ="+hashcode);
		
		
	  int hashcode1=obj1.hashCode();
		
	  System.out.println("hashcode ="+hashcode1);
	}

}


