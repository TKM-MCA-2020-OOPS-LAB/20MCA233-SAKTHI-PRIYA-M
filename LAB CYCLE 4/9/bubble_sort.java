package newpack;
import java.util.*;

public class bubble_sort {
	
	
	void sort(int arr[])
	{
		int n = arr.length;
		for(int i =0;i <n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]= temp;
				}
			}
		}
	}
	
	void display(int arr[])
	{
		System.out.println("Sorted Array :");
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args)
	{
		int n,e;
		System.out.println("Enter size of Array :");
		Scanner inp =new Scanner(System.in);
		n = inp.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element["+i+"]");
			e = inp.nextInt();
			arr[i]=e;
		}
		
		bubble_sort ob = new bubble_sort();
		ob.sort(arr);
		ob.display(arr);
		
	}

}