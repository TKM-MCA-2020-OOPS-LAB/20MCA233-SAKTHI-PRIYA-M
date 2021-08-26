package newpack;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class compare_hashset {

	public static void main(String[] args) {

		Set<Integer> s1=new HashSet<Integer>();
		Set<Integer> s2=new HashSet<Integer>();
		
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of element in first set:");
		n1=sc.nextInt();
		System.out.println("Enter the elements of first set:");
		for(int i=0;i<n1;i++)
		{
			int x=sc.nextInt();
			s1.add(x);
		}
		System.out.println("Enter the no of element in Second set:");
		n2=sc.nextInt();
		System.out.println("Enter the elements of Second set:");
		for(int i=0;i<n2;i++)
		{
			int y=sc.nextInt();
			s2.add(y);
		}
		
		System.out.println("HashSet1: "+s1);
		System.out.println("HashSet2: "+s2);
		
		System.out.println("\n****COMPARING TWO HASH SET****\n");
		Set<Integer> union = new HashSet<Integer>(s1);
        union.addAll(s2);
        System.out.print("Union of the two Set");
        System.out.println(union);
        
        Set<Integer> intersection = new HashSet<Integer>(s1);
        intersection.retainAll(s2);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
        
        Set<Integer> difference = new HashSet<Integer>(s1);
        difference.removeAll(s2);
        System.out.print("Difference of set1 from set2");
        System.out.println(difference);	
		
	}

}
