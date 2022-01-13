class base2
{
	private int s=10;
	int p=20;
	protected int d= 40;
	public int f=30;
	void show()
	{
		System.out.println(s+" "+p+" "+d+" "+f);
	}
}
public class AccessSpecifiers extends base2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifiers a=new AccessSpecifiers();
		a.show();
		
	}

}
