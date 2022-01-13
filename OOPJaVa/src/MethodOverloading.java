//method overloading: within a class same methods with different arguments
class Adder
{
	static int add(int a,int b) { return a+b ;}
	static int add(int a,int b,int c) {return a+b+c ;}
	}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(11, 10));
		System.out.println(Adder.add(10,12,13));

	}

}
