package Package1;

public class DoubleLoopAssignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*   *  4 space
		    *** 3 spae
		   ***** 
		  *******
		 ********* */
		
		 // first loop for rows -- 5
		//second loop space   ---4 space 
		//third loop
		//fourth loop
		
		
		for (int i=1;i<=5;i++ )
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
				for (int k=1;k<=i*2-1;k++)
				{
					System.out.print("*");
			}
				System.out.println("");
			}
		}
		
		
	}


