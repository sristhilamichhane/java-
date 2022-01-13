//MethodOverriding: having same method in super class and child class 
class vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}
class Bike extends vehicle
{
	void run()
	{
		System.out.println("Bike is running safely");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.run();

	}

}
