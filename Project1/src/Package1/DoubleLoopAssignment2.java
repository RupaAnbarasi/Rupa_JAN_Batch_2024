package Package1;

public class DoubleLoopAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1st LOgic
		/*for (int i=1;i<=5;i++) // Loop for  rows
		{
			for(int j=5;j>=i;j--) //Loop for columns
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		
		//2ndLOgic
		
		for (int i=5;i>=1;i--) // Loop for  rows
		{
			for(int j=1;j<=i;j++) //Loop for columns
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	}


