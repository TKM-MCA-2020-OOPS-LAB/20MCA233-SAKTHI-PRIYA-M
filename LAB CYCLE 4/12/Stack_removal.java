package newpack;

import java.util.*;

public class Stack_removal {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add: ");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter element"+i+":");
			int s=sc.nextInt();
			st.add(s);
		}
		System.out.println("\nStack: "+st);
		System.out.println("Enter the index of the element to be removed: ");
		int index=sc.nextInt();
		int rm=st.remove(index);
		System.out.println("Removed element: "+rm);
		System.out.println("\n Stack after removal: "+st);
		
	}

}
