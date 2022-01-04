import java.util.Scanner;

public class FactorialP {
	static int fact=1;

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int fact=1;
		int a=1;
		do
		{
			fact=fact*a;
			a++;
		}
		while(a<=n);
		System.out.println(fact);
	}


//(another method below)
	
		/*FactorialP f= new FactorialP ();
		f.fact(5);
		System.out.println("Factorial is "+fact);
		
		
	}
	void fact(int n) {
		if(n>=1) {
			fact=fact*n;
			fact(n-1);// recursive function 
		}
		*/
	}
