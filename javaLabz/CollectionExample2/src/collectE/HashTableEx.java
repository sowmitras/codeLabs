package collectE;
import java.util.*;

public class HashTableEx {

public static void main(String[] args) {
		
Hashtable<Integer, String> obj=new Hashtable<Integer,String>();

obj.put(5, "surbhi");
obj.put(1, "khare");
obj.put(2, "khare");
obj.put(4, "khare");
obj.put(1, "khare");
obj.put(1, "khare");
//obj.put(null, null);

System.out.println(obj);
	}

}
