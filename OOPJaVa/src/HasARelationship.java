//has a relationship are Aggregration(weak),composition(strong). Here reference variable is used. 

class operation{
	int square(int n)
	{
		return n*n;
		}
}
class circle
{
	operation op;
	double pi=3.14;
	double area(int radius)
	{
		op=new operation();
		int rsquare=op.square(radius);
		return pi*rsquare;
	}
}
public class HasARelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		double result = c.area(5);
		System.out.println(result);
				

	}

}
