class hehe
{
static int add() {
	int a=4;
	int b=3;
	return(a+b);
}
void display()
{
	int p=add();
	System.out.println(p);
	
}
}
public class MethodInJava {

	public static void main(String[] args) {
		hehe h=new hehe();
		h.display();

	}

}
