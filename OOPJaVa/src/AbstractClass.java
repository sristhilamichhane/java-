abstract class Apple
{
	abstract void taste();
	/*{
		System.out.println("sweet");
	}*/
}
public class AbstractClass {
	void taste()
	{
		System.out.println("sweet");	
	}

	public static void main(String[] args) {
		AbstractClass a=new AbstractClass();
        a.taste();
	}

}
