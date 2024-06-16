package Package1;

public class DoubleLoopAssignmnet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=1;i<=5;i++) // Loop for  rows
		{
			for(int j=1;j<=i;j++) //Loop for columns
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
