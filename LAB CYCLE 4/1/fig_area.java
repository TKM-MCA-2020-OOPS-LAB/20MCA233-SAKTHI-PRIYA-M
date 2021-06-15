package newpack;
import Graphics.*;
public class fig_area {
	public static void main(String[] args)
	{
		System.out.println("***RECTANGLE***");
		rect obj1 = new rect();
		obj1.getdata();
		obj1.area();
		System.out.println("\n");
		System.out.println("***TRIANGLE***");
		triang obj2 = new triang();
		obj2.getdata();
		obj2.area();
		System.out.println("\n");
		System.out.println("***SQUARE***");
		sqr obj3= new sqr();
		obj3.getdata();
		obj3.area();
		System.out.println("\n");
		System.out.println("***CIRCLE***");
		circ obj4= new circ();
		obj4.getdata();
		obj4.area();
	}
}
