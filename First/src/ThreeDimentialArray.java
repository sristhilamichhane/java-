
public class ThreeDimentialArray {
	public static void main(String args[]) {
		int a[][][]= {{{10,20,30},{2,2,2,2},{7,7,7,7,7}}};
		for( int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println(a[i][j][k]+" ");
				}
				System.out.println(" ");
			}
		}
	}

}
