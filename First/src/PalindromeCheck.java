import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number");
		int n= s.nextInt();
		int t=n;
		int rev=0;
		int rem;
		while(n!=0)
		{
		 rem=n%10;
		 rev=rev*10+rem;
		 n=n/10;
		}
		if(rev==t)
		{
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not palindrome");
		}

	}

}
