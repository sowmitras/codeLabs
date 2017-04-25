package nested;

interface subhi{
	
void set();
	
class ashish{
		
void get(){
			
System.out.println("get");
			
		}
	}
}


public class NestedInterfaceDemo3 extends subhi.ashish{

	public static void main(String[] args){
		
	subhi.ashish obj=new NestedInterfaceDemo3();
	
	obj.get();
		
	}
}
