//super keyword in java is used as a reference variable which refers the immediate parent class object
class Animal
{
	String color="white";
}
class Dog extends Animal
{
	String color="black";
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class SuperKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		d.display();

	}

}
