package newpack;

import Arithmetic.*;
import java.util.*;

public class arithmetic_operations {

	public static void main(String[] args)
	{
		double a,b;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a= inp.nextDouble();
		System.out.println("Enter Second Number: ");
		b= inp.nextDouble();
		System.out.println("***Addition***");
		add ob1=new add();
		ob1.result(a, b);
		System.out.println("***Substraction***");
		substract ob2=new substract();
		ob2.result(a, b);
		System.out.println("***Multiplication***");
		multiply ob3=new multiply();
		ob3.result(a, b);
		System.out.println("***Division***");
		divide ob4=new divide();
		ob4.result(a, b);
	}
}
