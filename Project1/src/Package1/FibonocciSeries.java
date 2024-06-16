package Package1;

import java.util.Scanner;

public class FibonocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lengthofseries;
		int num1=0;
		int num2=1;
		int nextnum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value of number");
		lengthofseries=s.nextInt();
		
		for(int i=0;i<lengthofseries;i++)
		{   
			System.out.print( num1  +" ");
			nextnum=num1+num2;
			num1= num2;
			num2=nextnum;
			
			
			
			
			
			
			
		}
		
		
	}

}
