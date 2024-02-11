package Package1;

public class MethodConstructorAssignmnet {
	
	public  void defaultmethod()
	{
		System.out.println("Default method");
	}
	public void method1()
	{
		System.out.println("one parameterized method");
	}
	public void method2()
	{  
		System.out.println("two parameterized method");
	}
	public void method3()
	{
		System.out.println("three parameterized method");
		this.method4();
		this.defaultmethod();
		this.method1();
		this.method2();
		
	}
	public void method4()
	{
		System.out.println("Four parameterized method");
	}
	
	public static void main(String[] args) {
		
		MethodConstructorAssignmnet obj=new MethodConstructorAssignmnet();
		
		obj.method3();
	}
	

}


