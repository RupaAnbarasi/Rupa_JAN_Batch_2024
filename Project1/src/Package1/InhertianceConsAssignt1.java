package Package1;

public class InhertianceConsAssignt1 {
	
	public InhertianceConsAssignt1()
	{
	    this(3,5,7);
		System.out.println("Parent default constructor");
	}
	
	public InhertianceConsAssignt1(int a)
	{   this();
		System.out.println("Parent one parameterized constructor");
	}
	
	public InhertianceConsAssignt1(int a,int b)
	{
		 this(1);
		System.out.println("Parent two parameterized constructor");
	}
	
	public InhertianceConsAssignt1(int a,int b ,int c)
	{
		
		System.out.println("Parent three parameterized constructor");	
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
}
