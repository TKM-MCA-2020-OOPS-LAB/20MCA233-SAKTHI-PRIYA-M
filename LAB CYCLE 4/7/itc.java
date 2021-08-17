package newpack;
class process
{
	int a;
	boolean produced = false;
	
	public synchronized void produce(int x)
	{
		if(produced)
		{
			System.out.println("Producer is waiting!");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		a=x;
		System.out.println("Product " + a + " is produced");
		produced = true;
		notify();
	}
	
	public synchronized void consume()
	{
		if( !produced)
		{
			System.out.println("Consumer is waiting!");
			
			try 
			{
				wait();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Product "+ a + " is consumed " );
		produced = false;
		notify();
	}
}

class producer extends Thread
{
	process b;
	
	public producer(process b)
	{
		this.b = b;
	}
	
	public void run()
	{
		System.out.println("Producer starts producing!");
		for(int i=1;i<=5;i++)
		{
			b.produce(i);
		}
	}
}

class consumer extends Thread
{
	process b;
	
	public consumer(process b)
	{
		this.b = b;
	}
	
	public void run()
	{
		
		System.out.println("Consumer is ready!");
		for(int i=1;i<=5;i++)
		{
			b.consume();
		}
	}
}

public class itc {
	
	public static void main(String[] asrgs)
	{
		process b = new process();
		producer p = new producer(b);
		consumer c = new consumer(b);
		
		p.start();	
		c.start();
	}

}