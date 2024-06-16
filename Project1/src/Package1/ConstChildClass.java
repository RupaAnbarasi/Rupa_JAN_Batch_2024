package Package1;

public class ConstChildClass extends InhertianceConsAssignt1 {
	
	
	public ConstChildClass()
	{
	    super(3,4);
		System.out.println("Child default constructor");
	}
	
	public ConstChildClass(int a)
	{
		this(2,3,4);
		System.out.println("Child one parameterized constructor");
	}
	
	public ConstChildClass(int a,int b)
	
	{   
		this();
		System.out.println("Child two parameterized constructor");
	}
	
	public ConstChildClass(int a,int b ,int c)
	{
		this(2,4);
		System.out.println("Child three parameterized constructor");	
	}
	
	public static void main(String[] args) {
		
		
		ConstChildClass obj=new ConstChildClass(1);
		
			}
	
	
	
	
	
	
	

}
