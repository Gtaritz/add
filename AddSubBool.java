import java.util.Scanner;
public class AddSubBool 
{
	public static void main(String ritz[])
	{
		
		int a,b,c,d;
		float f,g;
		boolean x;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		d=a-b;
		f=a*b;
		g=a/b;
		x= a>b;
		System.out.println("Additin =" + c );
		System.out.println("Substration ="+ d);
		System.out.println("multiplication ="+ f);
		System.out.println("division ="+g );
		System.out.println("Value ="+x );
	}
}
		