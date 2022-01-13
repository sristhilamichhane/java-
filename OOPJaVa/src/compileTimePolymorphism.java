//compile time  polymorphism achieved by method overloading

class bank1
{
	float intrest()
	{
		return 0.0f;
	}
}
class SBI1 extends bank{
	float intrest() {return 8.0f;}
}
class Machhapuchre1 extends bank
{
	float interst() {return 7.0f;}
}
public class compileTimePolymorphism{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank1 b = new bank1();
		System.out.println(b.intrest());
		
	}

}
