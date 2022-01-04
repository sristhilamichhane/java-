
public class TwoDimentionalArray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{20,20},{70,70,70}};
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print(" ");
		}

	}

}
