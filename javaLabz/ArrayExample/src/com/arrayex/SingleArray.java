package com.arrayex;

public class SingleArray {

	public static void main(String[] args) {

		
		int a[]={2,5,1,0,8,6,7,5};
		
		for(int i=0;i<a.length;i++)
			
			if(a[i]%2==0){
				
				System.out.println("even");
			}
		else {
			System.out.println("odd");
		}
		
	}

}
