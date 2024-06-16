package Package1;

public class CompliePolymorphism {
	
	public void sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("value  of c is"+ c);
		
	}

	
	public int sum(int x,int y,int z)
	{
		int r;
		r=x+y+z;
		System.out.println("value  of r is"+ r);
		return r;
	}
	
	public static void main(String[] args) {
		
		CompliePolymorphism obj= new CompliePolymorphism();
		obj.sum(5, 7);
		obj.sum(2, 5, 6);
	}
}
