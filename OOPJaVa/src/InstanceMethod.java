 
public class InstanceMethod {

	public static void main(String[] args) {
		
		InstanceMethod im=new InstanceMethod();
		System.out.println("main method");
		im.display();

	}
	void display()
	{System.out.println("from instance");}

}
