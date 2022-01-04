package manojkumar.m.SMSagencies;

import java.util.Scanner; 

public class oddevennumber {
	public static void main(String[] args) {
		int no;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		no =s.nextInt();
		if(no%2==0)
		{
			System.out.println("This number is even number");
		}
		else
		{
			System.out.println("This number is odd number");
		}
		
	}
	

}
