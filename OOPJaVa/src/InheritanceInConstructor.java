class Base
{
	int x;
	Base(int a){
     x=a;		
	}
}
class Derived extends Base
{
	int y;
	Derived(int c)
	{
	 super(15);
	 y=c;
	}
	void Display()
	{
		System.out.println(x+y);
	}
}
public class InheritanceInConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived D =new Derived(10);
		D.Display();

	}

}
