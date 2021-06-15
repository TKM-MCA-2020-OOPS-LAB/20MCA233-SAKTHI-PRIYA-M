package Graphics;
import java.util.Scanner;

public class sqr implements Shapes {
		int side,area;
		public void getdata()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square: ");
		side=sc.nextInt();
	
	    }
		public void area()
		{
			area=side*side;
			System.out.println("Area ofsqaure: ");
			System.out.print(area);
		}

}
