
public class ControlStatementExample {
public static void main(String args[]){
	int a=5;
	if(a<10) {
		System.out.println("a is less then 10");
	}
	else {
		System.out.println("a is not less then 10");
	}
	ControlStatementExample c= new ControlStatementExample();
	c.MethodEntryControl();
	c.MethodExitControl();
	c.MethodFor();
	c.MethodForEach();
	c.MethodSwitch();
	
}
void MethodSwitch(){
	int num=3;
	switch(num)
	{
	case 0: System.out.println("The number is 0"); break;
	case 1: System.out.println("The number is 1"); break;
	case 2: System.out.println("The number is 2"); break;
	default:System.out.println("the number is "+num); break;
	}
	
}
void MethodForEach(){
	String names[]= {"java","c++","c","python","Java script"};
     System.out.println("The name of programming languages are:");
     for(String name:names) {
     System.out.println(name);
     }
	
}
void MethodFor() {
	int sum=0;
	for(int i=0;i<5;i++) {
		sum=sum+i;
	     System.out.println("The sum is:"+sum);
	}
}
void MethodExitControl() {
	int d = 0;
	do {
		System.out.println(d);
		d=d+2;
	}
	while(d<=10);
}
void MethodEntryControl() {
	int c=0;
	while(c<5) {
		System.out.println(c);
		c=c+2;
	}
}
	
}
