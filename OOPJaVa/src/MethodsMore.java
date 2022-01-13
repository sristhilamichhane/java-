class employee{
	int id;
	String name;
	float salary;
	void insert(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}
public class MethodsMore {

	public static void main(String[] args) {
		employee e1=new employee();
		employee e2=new employee();
		employee e3=new employee();
        e1.insert(101,"Sristhi", 45000);
        e2.insert(102, "Kristhi", 55000);
        e3.insert(103, "Dristhi", 45000);
        e1.display();
        e2.display();
        e3.display();
	}

}
