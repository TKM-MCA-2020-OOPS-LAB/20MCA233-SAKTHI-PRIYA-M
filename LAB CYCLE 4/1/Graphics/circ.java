package Graphics;

import java.util.Scanner;

public class circ implements Shapes {
		int r;
		double area;
		
		public void getdata()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter radius of circle: ");
			r=sc.nextInt();
		}
		
		public void area()
		{
			area= 3.14*r*r;
			System.out.println("Area of circle: ");
			System.out.print(area);
		}
}
