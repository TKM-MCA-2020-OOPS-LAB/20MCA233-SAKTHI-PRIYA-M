package newpack;

import java.util.Scanner;

class negative extends Exception
{
	public negative()
	{
		super("Negative number not allowed!");
	}
}
public class average_exp {

	public static void main(String[] args) {
		int n,x,sum=0;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of N: ");
		n=sc.nextInt();
		
		for(int i=1;i<n+1;i++)
		{
			try
			{
				System.out.println("Enter number["+i+"]");
				x=sc.nextInt();
				if(x<0)
				{
					i--;
					throw new negative();
				}
				else
				{
					sum=sum+x;
				}
			}
			
			catch(negative e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		avg=(double)sum/n;
		System.out.println("\nAverage is: "+avg);

	}

}
