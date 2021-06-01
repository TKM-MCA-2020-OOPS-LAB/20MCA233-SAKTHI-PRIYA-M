import java.util.Scanner;
interface calculation{
    void input();
    void area();
    void perimeter();
}
class Circle implements calculation
{
    int r;
    double pi=3.14,ar,pr;
    @Override
    public void input()
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter radius:");
        r=sc1.nextInt();
    }

    @Override
    public void area()
    {
        ar=pi*r*r;
        System.out.println("Area of the circle:"+ar);
    }

    @Override
    public void perimeter()
    {
        pr=2*pi*r;
        System.out.println("Perimeter of the circle:"+pr);
    }
}
class Rectangle extends Circle{
    int l,b;
    double ar,pr;
    public void input()
    {
        super.input();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter length:");
        l=sc2.nextInt();
        System.out.println("Enter breadth:");
        b=sc2.nextInt();
    }
    public void area()
    {
        super.area();
        ar=l*b;
        System.out.println("Area of rectangle:"+ar);
    }
    public void perimeter()
    {
        super.perimeter();
        pr=(2*l)+(2*b);
        System.out.println("Perimeter of rectangle:"+pr);
    }
}
public class Areaperimeter {
    public static void main(String args[])
    {
       int choice;
       Rectangle obj=new Rectangle();
       while(true)
       {
           Scanner sc3=new Scanner(System.in);
           System.out.println("\n" + "1.Input the values"+"\n" + "2.Find area" + "\n" + "3.Find perimeter" + "\n" + "4.Exit");
           System.out.println("Enter the choice:");
           choice=sc3.nextInt();
           switch(choice)
           {
               case 1:
                    obj.input();
                    break;
               case 2:
                    obj.area();
                    break;
               case 3:
                    obj.perimeter();
                    break;
               case 4:
                    return;
                default:
                    System.out.println("Enter correct choice:");
           }
       }

    }
    
}
