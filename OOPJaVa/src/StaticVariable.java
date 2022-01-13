class get{
	static int marks;
}
public class StaticVariable {
	public static void main(String[] args) {
		get t=new get();
		get g=new get();
		t.marks=80;
		g.marks=90;
		System.out.println(t.marks);
		System.out.println(g.marks);

	}

}
