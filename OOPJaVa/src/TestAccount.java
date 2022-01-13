class Account
{
	int acn;
	String name;
	float amount;
	
void insert(int a,String n,float amt)	{
	acn=a;
	name=n;
	amount=amt;
}
 void deposit(float amt) {
	 amount=amount+amt;
	 System.out.println(amt+" deposited");
	 
 }
 void withdraw(float amt) {
	 if(amount<amt)
	 {
		 System.out.println("INSUFFICIENT BALANCE");
	 }
	 else
		 amount=amount-amt;
	 System.out.println(amt+" withdrawn");
	 }
 void checkBalance()
 {
	 System.out.println("Total balance :" +amount);
 }
 void display()
 {
	 System.out.println(acn+" "+name+" "+amount);
 }
 }

public class TestAccount {

	public static void main(String[] args) {
	Account t=new Account();
	t.insert(1234,"SRISTHI" ,200000);
	t.deposit(100000);
	t.withdraw(5000);
    t.checkBalance();
    t.display();
	}

}
