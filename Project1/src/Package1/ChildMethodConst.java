package Package1;

public class ChildMethodConst  extends ParentMethodCont
{public void method5()
	{
	    
		System.out.println("Child class default method");
	}
	
	public void method6(int a)
	{   
		System.out.println("Child class one parameterized method");
	}
	
	public void method7(int a,int b)
	{
		super.method3(3,4);
		super.method1();
		super.method4(5, 5, 6);
		super.method2(3);
		System.out.println("Child class two parameterized method");
	}
	
	public void method8(int a,int b ,int c)
	{
		this.method6(2);
		this.method5();
		System.out.println("Child class three parameterized method");	
	}


public static void main(String[] args) {
	
	ChildMethodConst obj1=new ChildMethodConst();
	obj1.method7(3,5);
	obj1.method8(1,4,6);
	
}

}
