package Package1;

public class ConstructorAssignment1 {
	
	public ConstructorAssignment1()
	{
		this(2,4,7);// control will go to three parameterized constructor
		System.out.println("Default constructor");
	}
	public ConstructorAssignment1(int a)
	{
		System.out.println("one parameterized constructor");
	}
	public ConstructorAssignment1(int a,int b)
	{  
		this(2);// control will go to one parameterized constructor
		System.out.println("two parameterized constructor");
	}
	public ConstructorAssignment1(int  a,int b ,int c)
	{
		
		System.out.println("three parameterized constructor");
	}
	public ConstructorAssignment1(int  a,int b ,int c,int d)
	{
		System.out.println("Four parameterized constructor");
	}
	
	
    public static void main(String[] args) 
	{
		ConstructorAssignment1 obj1 =new ConstructorAssignment1(); // control will go to defect constructor
		ConstructorAssignment1 obj3 =new ConstructorAssignment1(4,6);
		ConstructorAssignment1 obj4 =new ConstructorAssignment1(3,7,9,8);
		
		}
}
