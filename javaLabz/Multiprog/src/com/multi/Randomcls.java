package com.multi;

import java.util.Random;

public class Randomcls {

	public static void main(String[] args) {
		
		int cnt,number;
		
		Random random;
		
		random=new Random();
		
		for(cnt=1;cnt<=5;cnt++)
		{
			number=random.nextInt();
			
			System.out.print(cnt+"\t");
			
			System.out.println(number);
			
			
		}
		

	}

}
