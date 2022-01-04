
public class AnonymousArray {

	public static void main(String[] args) {
		AnonymousArray.sum(new int [] {40,50,60,70});}
	static void sum(int a[]) {
		int tot= 0;
		for( int i:a) {
			tot=tot+i;
		}
		System.out.println(tot);

	}

}
