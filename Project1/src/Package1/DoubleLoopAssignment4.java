package Package1;

public class DoubleLoopAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*one for rows
		  second for printing space in the column
		  third for printing * in the column

		     *
		    **
		   ***
		  ****
		 ***** */
		
		
		
		
		/*for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
				
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				System.out.println("");
			} */
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
				
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				System.out.println("");
		}

	}

}