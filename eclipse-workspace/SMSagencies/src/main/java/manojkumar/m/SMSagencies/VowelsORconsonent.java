package manojkumar.m.SMSagencies;


import java.util.Scanner;
public class VowelsORconsonent {
public static void main(String[] args) {
	int count=0;
	System.out.println("enter the character:");
	Scanner scan =new Scanner(System.in);
	String sentense=scan.nextLine();
	for(int i=0;i<sentense.length();i++)
	{
		char ch=sentense.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
		}
	
	}
	System.out.println("Number of vowels given in"+count);
}
}
