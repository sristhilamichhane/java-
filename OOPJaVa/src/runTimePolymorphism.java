//Run time polymorphism achieved by method overriding 

class bank
{
	float intrest()
	{
		return 0.0f;
	}
}
class SBI extends bank{
	float intrest() {return 8.0f;}
}
class Machhapuchre extends bank
{
	float interst() {return 7.0f;}
}
public class runTimePolymorphism{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b;
		b= new SBI();
		System.out.println(b.intrest());
		b=new  Machhapuchre();
		System.out.println(b.intrest());

	}

}
