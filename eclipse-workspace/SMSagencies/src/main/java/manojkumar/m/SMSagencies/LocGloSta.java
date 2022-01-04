package manojkumar.m.SMSagencies;

public class LocGloSta
{
	static int a=500;   //STATIC VARIABLE
	public void method()
	{
		int b=50;   //lLOCAL VARIABLE
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		int c=109;		//GLOBAL VARIABLE
		System.out.println(a);
		LocGloSta me=new LocGloSta();
		me.method();
		System.out.println(c);
		
	}
	
			
}
