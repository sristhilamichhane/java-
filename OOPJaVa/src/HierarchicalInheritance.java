class Father
{
	int a=2000;
	void display()
	{
		System.out.println("Have:"+a);
	}
}
class Daughter extends Father
{
	void gets()
	{
		System.out.println("Gets:1000");
	}
}
class Son extends Father
{
	
	void Asks()
	{
		System.out.println("Asks for 500");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Daughter d=new Daughter();
		Son s= new Son();
		d.gets();
		d.display();
		s.Asks();
		s.display();

	}

}
