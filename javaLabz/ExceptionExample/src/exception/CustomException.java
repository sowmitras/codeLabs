package exception;

class InvalidAgeException extends Exception
{

	public InvalidAgeException(String string) {
		
	System.out.println("invalid  age");
	}
	
}

class Test
{
	public void getAge(int age)throws InvalidAgeException
	{
		if(age>50)
		{
			throw new InvalidAgeException("invalid");
		}
		else
		{
			System.out.println("valid");
		}
	}
}

public class CustomException {

public static void main(String[] args) throws InvalidAgeException{
	
	Test obj=new Test();
	obj.getAge(250);
	
	
	}

}
