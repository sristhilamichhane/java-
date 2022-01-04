
public class RevOfString {

	public static void main(String[] args) {
		String n="Sristhi";
		String rev="";
		int len=n.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+n.charAt(i);
		}
		System.out.println(rev);
		
	}

}
