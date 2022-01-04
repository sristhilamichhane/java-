
public class ArmstrongNum {

	public static void main(String[] args) {
		int num=153;
		int ori=num;
		int sum=0;
		int rem=0;
		while(num!=0)
		{ 
			rem=num%10;
			sum=sum+rem*rem*rem;
		 	num=num/10;
		}
		if(sum==ori) {
			System.out.println("is Armstrong number");
		}
		else
		{
			System.out.println("is not Armstrong number");
		}
	}

}
