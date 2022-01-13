class Student1
{
	int id;
	String name;
	Student1(int i,String n)
	{
	id=i;
	name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s= new Student1(34,"sristhi");
		s.display();

	}

}
