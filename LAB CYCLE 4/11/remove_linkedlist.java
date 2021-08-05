package newpack;

import java.util.*;

public class remove_linkedlist {

	public static void main(String args[])
	{
		LinkedList<String> list=new LinkedList<String>();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees to enter: ");
		n=sc.nextInt();
		for(int i=1;i<n+1;i++)
		{
			System.out.println("Enter employee name_"+i+":");
			String emp=sc.next();
			list.add(emp);
		}
		
		System.out.println("Linked list after entering employee names: ");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		list.clear();
		System.out.println("Linked list after removal: ");
		
	}
}
