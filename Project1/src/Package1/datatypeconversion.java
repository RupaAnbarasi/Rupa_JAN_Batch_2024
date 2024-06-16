package Package1;

public class datatypeconversion {
	

	public void ABC()
	{
		int a=34;
		float b=a;// Implicit Conversion
		System.out.println(b);
	}
	

	public void XYZ()
	{
		float a=34.6F;
		int b ;
		b= (int)a;// Explicit Conversion
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		datatypeconversion ob= new datatypeconversion();
		ob.ABC();
		ob.XYZ();
	}

}
