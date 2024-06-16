package Package1;

import java.util.Scanner;

public class PrimeNumber {
	
	//Number should be divisible by 1 or itself
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int n;
		Boolean prime =true;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of number");
		n=s.nextInt();
		
		for(int i=2;i<n;i++) // take loop 2, 3,4,5.....<n
		{
		 if(n%i==0)
		 {
			 prime= false;
			 break;
			
		}
		}
		
		System.out.println(prime);
		
		
		
		
		
	}


}