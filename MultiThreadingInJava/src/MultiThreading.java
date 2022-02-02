
 class ThreadCount extends Thread {
	
	ThreadCount()
	{
		super("overriding Thread class");
		System.out.println("New Thread created"+this);
		start();
	}
	
	public void run()
	{
		try {
			for (int i=0;i<3;i++)
			{
				System.out.println("New Thread created"+this);
				
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Currently executing thread is interrupted");	
		}
		
		System.out.println("Currently executing thread run is terminated");
	}
	
}

public class MultiThreading
{
	public static void main(String []args)
	{
		ThreadCount c= new ThreadCount();
		
		
		try {
			while(c.isAlive())
			{
				System.out.println("Main Method Thread will be alive,until its child Thread says alive");
			}
			Thread.sleep(2500);
		}
		catch(InterruptedException e)
		{
 			    System.out.println("Main method thread is interrupted");
		}
		
		
		System.out.println("Main methods thread run is terminited ");
	}
}
