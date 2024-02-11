package Package1;

//Assignment Question is    ( ( (((10/2)-2)+2)-2)/2)--- 3 methods

public class Arithmetic2 
{
	//method1
	public int div(int r1,int r2)
	{
		int r3= r1/r2;
		return r3;
		}
    //method2
	public int sum(int a,int b)
	{
		int c= a+b;
		return c;
		}
	///method3
	public int sub(int x1,int x2)
	{
		int x3= x1-x2;
		return x3;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Arithmetic2 obj= new Arithmetic2();
		
		int divresult =obj.div(10, 2);
		
		
		int subresult=obj.sub(divresult, 2);
		
		
		
		int sumresult=obj.sum(subresult, 2);
		
		
		int finalsub =obj.sub(sumresult,2);
		
		System.out.println(finalsub);
		
		float finalresult= obj.div(finalsub,2);
		
		System.out.println(finalresult);
		
		
			
		
		
	}
	
}
