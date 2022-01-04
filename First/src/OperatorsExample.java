
public class OperatorsExample {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int a=50;
		int b=5;
		boolean c=true;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(y--);
		System.out.println(--y);
		System.out.println(~x);
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(10<<2);
		System.out.println(10>>2);
		System.out.println(-20>>2);
		System.out.println(-20>>>2);
		System.out.println(a<b&a++<b);
		System.out.println(a<b&&a++<b);
		System.out.println(a>b|a++>b);
		System.out.println(a>b||a++>b);
		System.out.println(a<b&a++<b);
		int min=(a<b)?a:b;
		System.out.println(min);
		a+=4;
		System.out.println(a);
	}

}
