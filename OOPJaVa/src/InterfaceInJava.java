//interface is the blue print of the class.It is used to achieve abstraction in java. It also helps to support multiple inheritance.
interface printable
{
	void print();
	
}
interface showable
{
	void show();
}
class Child implements printable,showable
{
	public void print()
	{
		System.out.println("It's printable");
	}
	public void show()
	{
		System.out.println("It's showable");
	}
}

public class InterfaceInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Child c= new Child();
   c.show();
   c.print();
	}

}
