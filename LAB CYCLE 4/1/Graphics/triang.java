package Graphics;

import java.util.Scanner;

public class triang implements Shapes {
		int b,h;
		double area;
		
		public void getdata()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter breadth of trangle: ");
			b=sc.nextInt();
			System.out.println("Enter height of trangle: ");
			h=sc.nextInt();
		}
		
		public void area()
		{
			area= 0.5*b*h;
			System.out.println("Area of triangle: ");
			System.out.print(area);
		}

}
