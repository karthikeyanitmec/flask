package manojkumar.m.SMSagencies;


public class swapping {
	public static void main(String[] args) {
		int a=210;
		int b=290;
		System.out.println("Before swapping number " +a+ "  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping number :" +a+ "   "+b);
	}

}
