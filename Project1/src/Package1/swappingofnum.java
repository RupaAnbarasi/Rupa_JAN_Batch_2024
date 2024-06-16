package Package1;

public class swappingofnum {
	
	public void Swapping(int a,int b)
	{

		System.out.println("before swapping valueof a"+ a);
		System.out.println("before swapping value of b"+ b);
		
		
		a= a+b; // a=12 ,b=15  , a=27
		b=a-b; // a=27 , b=15  b=12
		a=a-b; //a=27 , b=12 ,  a=15
		
		System.out.println("after swapping valueof a"+ a);
		System.out.println("after swapping value of b"+ b);
		
		
	}

	public static void main(String[] args) {
		
	swappingofnum ob =new swappingofnum();
	ob.Swapping(12, 15);
		
	}
}
