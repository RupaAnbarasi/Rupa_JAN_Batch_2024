package Package1;

//Question is (((((10+2)+2)-2)*2)/2)   ---4 methodsrequired

public class Arithmetic1 {
	//method1
	public int sum(int a,int b)
	{
		int c= a+b;
		return c;
		}
	///method2
	public int sub(int x1,int x2)
	{
		int x3= x1-x2;
		return x3;
		}
	//method3
	public int mul(int c1,int c2)
	{
		int c3= c1*c2;
		return c3;
		}
	//method4
	public void div(int r1,int r2)
	{
		int r3= r1/r2;
		System.out.println("Final resultis"+ " :"+ r3);
		}
	
public static void main(String[] args) 
{
	
	Arithmetic1 obj= new Arithmetic1();
	
	int sumresult1= obj.sum(10, 2);
	int finalsum =obj.sum(sumresult1, 2);
	int subresult=obj.sub(finalsum,2);
	int mulresult =obj.mul(subresult,2);
	 obj.div(mulresult,2);
	
	
	
		
		
		

}

}
