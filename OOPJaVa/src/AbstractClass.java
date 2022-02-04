abstract class Apple
{
	abstract void taste();
	/*{
		System.out.println("sweet");
	}*/
}
public class AbstractClass extends Apple {
	void taste()
	{
		System.out.println("sweet");	
	}

	public static void main(String[] args) {
		Apple a=new AbstractClass();
        a.taste();
	}

}
