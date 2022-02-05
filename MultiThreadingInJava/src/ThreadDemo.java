class Hi extends Thread
{
	public void run()
	{
		for (int i=1;i<=3;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Hello extends Thread
{
	public void run()
	{
		for (int i=1;i<=3;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi o1=new Hi();
       Hello o2=new Hello();
       o1.start();
       try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       o2.start();
	}

}
