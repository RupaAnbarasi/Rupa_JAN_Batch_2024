package Package1;

import java.util.Scanner;

public class Fcatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int fact=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of number");
		n=s.nextInt();
		
		for(int i=1;i<=n;i=i+1)
		{
		 fact=fact*i;
		
		}
		 System.out.println("Fcatoria  of a give number is "+ fact);
      
	}

}
