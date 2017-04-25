package collectE;
import java.util.*;

public class Haashmapex2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> obj=new  HashMap<Integer, String>();
		
		obj.put(1,"s");
		
		obj.put(2,"suru");
		
		System.out.println("before remove"+obj);
		
	obj.remove(1);
		//obj.get(1);
		System.out.println("after remove"+obj);
		

	}


}
