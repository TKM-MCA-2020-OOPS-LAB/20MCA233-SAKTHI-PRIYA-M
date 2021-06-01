import java.util.*;

class publisher
{
	String pbname;
	Scanner a=new Scanner(System.in);
	public publisher()
	{
		
		System.out.println("Enter publisher name:");
		pbname=a.next();
	}
}
class book extends publisher
{
	String bookname;
	String Author;
	public book()
	{
		System.out.println("Enter book name:");
		bookname=a.next();
		
		System.out.println("Enter Author name:");
		Author=a.next();
		
		
	}
}
class literature extends book
{
	public literature()
	{
		System.out.println("category:literature");
		System.out.println("______________________________");
	}
	void display()
	{
		System.out.println("publishername:"+pbname);
		System.out.println("book name:"+bookname);
		System.out.println("Author name:"+Author);
	}
}
class fiction extends book
{
	public fiction()
	{
		System.out.println("category:fiction");
		System.out.println("__________________________________");
		System.out.println("\n");
	}
	void display()
	{
		System.out.println("publishername:"+pbname);
		System.out.println("book name:"+bookname);
		System.out.println("Author name:"+Author);
	}
}
public class Books {
    public static void main(String[] args) {
	
		int i,nb;
		
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the no of literature books you need to store:");
		nb=b.nextInt();
		literature l[]=new literature[nb];
		for( i=0;i<nb;i++)
		{
			l[i]=new literature();
			
		}
		System.out.println("Enter the no of fictional books you need to store:");
		int m;
		m=b.nextInt();
		fiction f[]=new fiction[m];
		for( i=0;i<m;i++)
		{
			f[i]=new fiction();
			
		}
		
		System.out.println(" Displaying literature books:\n");
		for(i=0;i<nb;i++)
		{
			System.out.println("Displaying details of book no"+(i+1));
			l[i].display();
		}
		System.out.println("  Displaying fictional books:\n");
		for(i=0;i<m;i++)
		{
			System.out.println("Displaying details of book no: \t"+(i+1));
			f[i].display();
		}
	
		
		}
}

