package com.multi;

public class GarbageCollect {
	
	protected void finalize()
	{
		System.out.println("finalize");
	}

public static void main(String[] args) {
	
	GarbageCollect obj=new GarbageCollect();
	
	GarbageCollect obj1=new GarbageCollect();

	obj=obj1=null;
	
		//obj=null;
		
		System.gc();
		
		obj.finalize();

	}

}
