package collectE;

import java.util.*;

public class Hashmapex {

public static void main(String[] args) {
	
HashMap<Integer,String> obj=new HashMap<Integer,String>();
	
     obj.put(1,"hello");
    
     obj.put(1, "surbhi");
     
     obj.put(5, "surbhi");
     
     obj.put(5, "surbhi");
     
     obj.put(8, null);
     
     obj.put(1, null);
     
     obj.put(null, null);
     
     
    
   // obj.put(4, "surbhi");
    
   // obj.put(2, "surbhi");
    
    //obj.put(2, "hello");
    
//  for(Map.Entry m:obj.entrySet())
//  {
//	   System.out.println(m.getKey()+" "+m.getValue());
//  }
     
     Set set=obj.entrySet();
     
     System.out.println(set);
	}

}
