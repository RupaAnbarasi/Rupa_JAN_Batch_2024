package Package1;

public class student {
	
	int rollno;
	int age;
	
	
	public void display1()
	{
		System.out.println("Welocme to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	

	public static void main(String[] args) 
	
	{
	
		student obj1=new student();
		
		obj1.rollno=1;
		obj1.age=15;
		System.out.println("Studen rollnumber is" +obj1.rollno);
		System.out.println("Studen age is" +obj1.age);
		
		obj1.display1();
		obj1.display2();
		
		
		
	}

}
