
public class HalfPyramid {

	public static void main(String[] args) {
for(int i=0;i<=4;i++)
{
	/*for(int j=0;j<=4;j++)*///gives rectangle types pattern.
	/*for(int j=0;j<=i;j++)*///gives L type structure. i.e half pyramid
	for(int j=4;j>=i;j--)//gives inverted half pyramid.
	{
		System.out.print("*\t");
	}
	System.out.println(" ");
}

	}

}
