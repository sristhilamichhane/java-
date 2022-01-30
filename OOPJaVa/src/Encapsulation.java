class xyz
{
	private int value;
	
	public void setValue(int v)
	{
		value=v;
	}
	public int getValue()
	{
		return value;
	}
}
public class Encapsulation {
	
	

	public static void main(String[] args) {
		xyz e=new xyz();
		e.setValue(100);
		System.out.println(e.getValue());
		
	}

}
