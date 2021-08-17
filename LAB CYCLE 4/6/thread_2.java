package newpack;
import java.io.IOException;

import java.util.*;

class threadX implements Runnable
{
	int n,t1=0,t2=1,next=t1+t2;
	public threadX(int n) 
	{
		this.n = n;
	}

	public void run()
	{
		System.out.println("***Executing First Thread***\n");
		System.out.println("Fibonacci Series : ");
		System.out.print(t1 + " "+ t2);
		for(int i =3;i<=n;++i)		
		{
			System.out.print( " " + next );
			t1 = t2;
			t2 = next;
			next = t1+t2;
		}
		System.out.println("** First Thread executed successfully**");
	}
}


class threadY implements Runnable
{
	int n;
	public threadY(int n) 
	{
	this. n =n;
	}

	public void run()
	{
		System.out.println("***Executing Second Thread***\n");
		System.out.println("Even Numbers : ");
		for(int i = 2;i<=n;i++)
		{
			if(i %2 == 0)
			{
				System.out.print( i + " ");
			}
		}
		System.out.println("**Second Thread executed successfully**");
	}
}


public class thread_2 {

	public static void main(String[] args) 
	{
		int n;
		   
		   Scanner inp = new Scanner(System.in);
		   System.out.println("Enter Limit :  ");
		   n = inp.nextInt();
		   threadX fib_obj = new threadX(n);
		   threadY even_obj = new threadY(n);
		   
		   
		   Thread obj1 = new Thread(fib_obj);
		   Thread obj2 = new Thread(even_obj);
		   obj1.start();
		   
		   try 
		   {
			obj1.join();
		   } 
		   catch (InterruptedException e) 
		   {
			e.printStackTrace();
		   }
		   obj2.start();

	}

}
