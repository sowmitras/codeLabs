package collectE;
import java.util.*;

public class LinkedHashmapEx {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> obj=new LinkedHashMap<Integer,String>();
		
		obj.put(1, "sur");
		obj.put(null, "abc");
		obj.put(null, "abc");
		obj.put(4, null);
		obj.put(5, null);
		
		System.out.println(obj);
		obj.remove(null);
		System.out.println(obj);
		

	}

}
