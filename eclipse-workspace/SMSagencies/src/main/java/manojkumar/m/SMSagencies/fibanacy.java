package manojkumar.m.SMSagencies;


public class fibanacy {
public static void main(String[] args) {
	int n1=10,n2=20,n3,r,value=5;
	System.out.println(n1+""+n2);
	for(r=1;r<=value;r++)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
	System.out.println("fibanacy number is "+n3);
	}
}
}
