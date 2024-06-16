package Package1;

public class swppingofwiththirdvariable {
	
	
	public void Swapping(int a,int b)
	{
        int temp=0;
		System.out.println("before swapping valueof a"+ a);
		System.out.println("before swapping value of b"+ b);
		
		temp= b;   //temp= 15
				
		b= a;    // b=12
		
		a= temp; // a=15
		
		
		
		System.out.println("after swapping valueof a"+":" +a);
		System.out.println("after swapping value of b"+":"+b);
		
		
	}

	public static void main(String[] args) {
		
	swappingofnum ob =new swappingofnum();
	ob.Swapping(12, 15);
		
	}

}
