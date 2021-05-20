package mypackage;

import java.util.Scanner;

class Employee {

	int empid, salary;
	String name,address;
	
	public Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id: ");
		empid=sc.nextInt();
		System.out.println("Enter employee name: ");
		name=sc.next();
		System.out.println("Enter employee salary: ");
		salary=sc.nextInt();
		System.out.println("Enter employee address: ");
		address=sc.next();	
	}
}
class Teacher extends Employee{
	
String department,subject;

	public Teacher() 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter teacher department: ");
		department=sc1.next();	
		System.out.println("Enter subject taught: ");
		subject=sc1.next();	
	}
	
	public void display()
	{
		System.out.println("Employee id: "+empid);
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+salary);
		System.out.println("Employee address: "+address);
		System.out.println("Teacher department: "+department);
		System.out.println("Subject taught: "+subject+"\n");
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		int n;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the number of teachers : ");
		n = sc2.nextInt();
		Teacher obj[] = new Teacher[n];		
		for(int i=0;i<n;i++)
		{
			obj[i] = new Teacher();
			
		}	
		System.out.println("----------------");
		System.out.println("Employee details");
		System.out.println("----------------");
		
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println(" Employee : " + (i+1)+"\n");
	    	obj[i].display();
	    }

	}

}
