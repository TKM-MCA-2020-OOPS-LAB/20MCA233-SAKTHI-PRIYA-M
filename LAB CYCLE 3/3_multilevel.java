package mypackage;

import java.util.Scanner;

class person
{
	String name,gender,address;
	int age;
	
	public person()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=sc.next();
		System.out.println("Enter gender: ");
		gender=sc.next();
		System.out.println("Enter address: ");
		address=sc.next(); 
		System.out.println("Enter age:");
		age=sc.nextInt();
	}
}

class employee1 extends person
{
	int empid,sal;
	String cname,quali;
	
	public employee1()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter employee id:");
		empid=sc1.nextInt();
		System.out.println("Enter comapany name:");
		cname=sc1.next();
		System.out.println("Enter qualification: ");
		quali=sc1.next();
		System.out.println("Enter salary:");
		sal=sc1.nextInt();	
	}
}

class teacher1 extends employee1
{
	String sub,dept;
	int teachid;
	
	public teacher1()
	{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Subject:");
		sub=sc2.next();
		System.out.println("Enter department: ");
		dept=sc2.next();
		System.out.println("Enter teacher id:");
		teachid=sc2.nextInt();
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
		System.out.println("Employee id: "+empid);
		System.out.println("Company name: "+cname);
		System.out.println("Qualification: "+quali);
		System.out.println("Salary: "+sal);
		System.out.println("Subject: "+sub);
		System.out.println("Department: "+dept);
		System.out.println("Teacher id: "+teachid);
	}
}

public class multilevel {

	public static void main(String[] args) { 
		int n;
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter the number of teachers: ");
		n=sc3.nextInt();
		
		teacher1 obj[]=new teacher1[n];
		
		for(int i=0;i<n;i++)
		{
			obj[i]=new teacher1();
		}
		
		System.out.println("----------------");
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("----------------");
		
		 for(int i=0;i<n;i++)
		    {
		    	System.out.println(" Employee : " + (i+1)+"\n");
		    	obj[i].display();
		    }
	}

}
