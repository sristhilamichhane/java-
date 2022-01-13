class Test
{
int marks;
int roll=10;
}

public class InstanceVariable { 
	public static void main(String[] args) {
		Test t= new Test();
		t.marks=90;
		System.out.println(t.roll);
		System.out.println(t.marks);
		

	}

}
