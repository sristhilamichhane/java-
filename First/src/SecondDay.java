
public class SecondDay {
 int i=10;
 static int m=100;
 void method (int k)
 {
	 int n=k;
	 System.out.println("local variable"+n);
 }
	public static void main(String[] args) {
		
		SecondDay s=new SecondDay();
		System.out.println("instance variable " +s.i);
		System.out.println("static variable "+m);
		s.method(30);
	//datatype 
		//primitive : data size fixed vako, like int,char,float etc,system ma memory allocation afai garxa vani
		//non primitive: jun primitive bata derived vako,and data type is fixed , eg:array,
	
	}

}
