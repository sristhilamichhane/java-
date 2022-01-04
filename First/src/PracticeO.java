
public class PracticeO {
 int a= 10;
 static int b=20;
 void method () {
	 int c;
	 c=a+b;
	 System.out.println(c);
	 
 }
	public static void main(String[] args) {
		double d=4.9005d;
		float f=50.03f;
		char s='m';
		System.out.println("Who is she?"+s);
		System.out.println("with"+" "+d+" "+"height");
		System.out.println("with"+" "+f+" "+"weight");
        PracticeO p=new PracticeO();
        System.out.println(p.a);
        System.out.println(PracticeO.b);
          p.method();    
          


	}

}
