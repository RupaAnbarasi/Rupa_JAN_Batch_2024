package Package1;

public class Runtimepolymorphism  extends CompliePolymorphism{
	
	public void sum(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("value  of c is"+ c);
		
	
	}
	
	public static void main(String[] args) {
		
		Runtimepolymorphism obj1=new Runtimepolymorphism();
		obj1.sum(6, 5);
	}

}
