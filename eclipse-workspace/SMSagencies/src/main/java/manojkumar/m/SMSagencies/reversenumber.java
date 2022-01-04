package manojkumar.m.SMSagencies;


import java.util.Scanner;

public class reversenumber {
	public static void main(String[] args) {
		long num;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		num=s.nextLong();
		long reversed=0;
		while(num!=0)
		{
			long digit=num%10;
			reversed=reversed*10+digit;
			num/=10;
			System.out.println("reversed numbers:"+reversed);
		}
			
		
	}

}
