package newpack;

import java.util.Scanner;

class threadA extends Thread
{
	int x;
	public threadA(int x)
	{
		this.x=x;
	}
	public void run()
	{
		System.out.println("***Executing First Thread***");
		System.out.println("Multiplication table of 5: ");
		for(int i=1;i<=x;i++)
		{
			System.out.println(i+" x 5 = "+(5*i));
			try
			{
				threadA.sleep(300);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("**First thread exectued Successfully!** ");
	}
}
class threadB extends Thread
{
	
	int y;
	public threadB(int y)
	{
		
		this.y = y;
	}

	public void run()
	{
		
		System.out.println("***Executing Second Thread***");
		System.out.println("Displaying first "+ y  + " prime numbers......");
		int count = 0;
		int prime_count = 1;
		for(int i =2;i<=1000;i++)
	    {
	        count = 0;
	        if(prime_count <=y)
	        {
	        	for(int j= i-1;j>=1;j--)
	        	{
	        		if(i % j == 0)
	        		{
	        			++count;
	        		}
	        		else
	        		{
	        			continue;
	        		}
	        	}
	        if(count  == 1)
	        {
	        	System.out.println(i);
	        	prime_count++;
	        }
	        
	        try
	        {
				threadB.sleep(100);
			} 
	        catch (InterruptedException e)
	        {
				e.printStackTrace();
			}
	        }
	     }
		System.out.println("**Second Thread executed Sucessfully!!**");	
	}
}

public class thread_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter Limit of Multiplication Table : ");
		a = sc.nextInt();
		System.out.println("Enter Limit for displaying Prime Numbers :");
		b=sc.nextInt();
		
		threadA obj1 = new threadA(a);
		obj1.start();
		try 
		{
			obj1.join();
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		threadB obj2 = new threadB(b);
		obj2.start();
	

	}

}
