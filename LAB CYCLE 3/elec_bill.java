import java.util.*;
import java.time.*;

interface cal_bill
{
	public void calc();
	
}

class calculate implements cal_bill
{
	int p_id,qty,up,tot,o_n,date;
	String name;
	public void details()
	{
		Scanner inp1 = new Scanner(System.in);
		
		System.out.println("Enter Product ID : ");
		p_id = inp1.nextInt();
		System.out.println("Enter Name : ");
		name = inp1.next();
		System.out.println("Enter Quantity : ");
		qty = inp1.nextInt();
		System.out.println("Unit Price : ");
		up = inp1.nextInt();
		
	}
	
	public void order()
	{
		Scanner inp2 = new Scanner(System.in);
		System.out.println("Enter Order No : ");
		o_n = inp2.nextInt();
	}
	
	public void calc()
	{
		tot = qty * up;
		System.out.println("   "+p_id+"\t\t "+name+"\t   "+qty+"\t\t    "+up+"\t         "+tot);
		
		
	}
	
	void display()
	{
		System.out.print("\n");
		System.out.println("BILL");
		System.out.println("==========");
		System.out.print("\n");
		System.out.println("Order No : " + o_n);
		LocalDate obj = LocalDate.now();         //to print the date
		System.out.print("\n");
		System.out.println("Date : " + obj);
		System.out.print("\n");
		System.out.println("Product Id\tName\tQuantity\tunit price\tTotal");
		System.out.print("_______________________________________________________________________");
		System.out.print("\n");
		
	}

}
public class elec_bill {
    public static void main(String[] args)
    {
        int no,net = 0;
        
        Scanner inp3 = new Scanner(System.in);
        System.out.println("Enter no of products : ");
        no = inp3.nextInt();
        calculate or = new calculate();
        
        calculate obj[] = new calculate[no];
        
        or.order();
        
        for(int i=0;i<no;i++)
        {
            System.out.print("\n");
            System.out.println("Enter Details of product "+ (i+1));
          System.out.println("==========================");
  
            obj[i] = new calculate();
            obj[i].details();
            
        }
        
        
        or.display();
        
        for(int i=0;i<no;i++)
        {
            obj[i].calc();
            net = net + obj[i].tot;
        }
        
        System.out.println("_______________________________________________________________________");
        System.out.println("    "+"\t\t  "+"\t    "+"\t\tNet amount :"+"\t "+net);
            
        
    }

    
}
