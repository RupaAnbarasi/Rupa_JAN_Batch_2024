package Package1;

//Assignment Question is    ( ( (((10/2)-2)+2)-2)/2)--- 3 methods

public class Arithmetic2 
{
	//method1
	public float div(float r1,float r2)
	{
		float r3= r1/r2;
		return r3;
		}
    //method2
	public float sum(float a,float b)
	{
		float c= a+b;
		return c;
		}
	///method3
	public float sub(float x1,float x2)
	{
		float x3= x1-x2;
		return x3;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Arithmetic2 obj= new Arithmetic2();
		
		float divresult =obj.div(10, 2);
		
		
		float subresult=obj.sub(divresult, 2);
		
		
		
		float sumresult=obj.sum(subresult, 2);
		
		
		float finalsub =obj.sub(sumresult,2);
		
		System.out.println(finalsub);
		
		float finalresult= obj.div(finalsub,2);
		
		System.out.println(finalresult);
		
		
			
		
		
	}
	
}
