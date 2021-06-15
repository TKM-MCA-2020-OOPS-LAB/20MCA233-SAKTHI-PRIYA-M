package Graphics;

import java.util.Scanner;

public class rect implements Shapes {
		int l,b,area;
		public void getdata()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		l=sc.nextInt();
		System.out.println("Enter breadth of rectangle: ");
		b=sc.nextInt();
	    }
		public void area()
		{
			area=l*b;
			System.out.println("Area of rectangle: ");
			System.out.print(area);
		}

}
