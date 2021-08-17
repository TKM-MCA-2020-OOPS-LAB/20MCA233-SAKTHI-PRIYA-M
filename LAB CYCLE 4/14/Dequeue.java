package newpack;
import java.util.*;
public class Dequeue {

	public static void main(String[] args) {
		int choice;
		String x;
		Deque<String> deque=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.INSERT AT FIRST");
			System.out.println("2.INSERT AT LAST");
			System.out.println("3.DELETE AT FIRST");
			System.out.println("4.DELETE AT LAST");
			System.out.println("5.DISPLAY DEQUEUE");
			System.out.println("6.EXIT");
			System.out.println("\n Enter the choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("ENTER THE ELEMENT TO BE INSERTED AT FIRST:");
					x=sc.next();
					deque.addFirst(x);
					break;
			case 2:System.out.println("ENTER THE ELEMENT TO BE INSERTED AT LAST:");
					x=sc.next();
					deque.addLast(x);
					break;
			case 3:System.out.println("ELEMENT DELETED FROM FIRST POSITION:");
					deque.removeFirst();
					break;
			case 4:System.out.println("ELEMENT DELETED FROM LAST POSITION:");
					deque.removeLast();
					break;
			case 5:System.out.println(deque+"\n");
					break;
			case 6:System.exit(0);
					break;
			default: System.out.println("INVALID CHOICE");
			}
			
			}while(true);
		
		
	}

}
