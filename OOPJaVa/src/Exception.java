
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; a=5;
		int b; b=0;
		int c;
		 try{  
		      //code that may raise exception  
		     c=a/b; 
		     System.out.println(c);
		   }catch(ArithmeticException e){System.out.println(e);}  
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }  

	}
	

