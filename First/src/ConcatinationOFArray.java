
public class ConcatinationOFArray {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {4,5,6,7};
		int aa=a.length;
		int bb=b.length;
		int c[]=new int[aa+bb];
		for(int i=0;i<aa;i++)
		{
			c[i]=a[i];
		}
		for(int j=0;j<bb;j++)
		{
			c[aa+j]=b[j];
		}
		for(int k=0;k<c.length;k++) {
			System.out.println(c[k]);
		}

	}

}
