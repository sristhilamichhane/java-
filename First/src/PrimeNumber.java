import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int a= s.nextInt();
		if(a%2==0) {
			System.out.println("IS Prime");
		}
		else
		{
			System.out.println("Not a Prime ");
		}

	}

}
