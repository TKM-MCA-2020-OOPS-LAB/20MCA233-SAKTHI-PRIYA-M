package CO6;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class cpy_evenodd {

	public static void main(String args[]) throws IOException
	{ 
    FileInputStream fr = new FileInputStream("C:\\Users\\vigne\\eclipse-workspace\\LABCYCLE6\\src\\CO6\\numbers.txt");
    FileOutputStream fw1 = new FileOutputStream("C:\\Users\\vigne\\eclipse-workspace\\LABCYCLE6\\src\\CO6\\even.txt");
    FileOutputStream fw2 = new FileOutputStream("C:\\Users\\vigne\\eclipse-workspace\\LABCYCLE6\\src\\CO6\\odd.txt");
    System.out.println("Even numbers are copied to even.txt");
    System.out.println("Odd numbers are copied to odd.txt"); 
    int i;
	while(( i=fr.read()) != -1)  
    {
     if(i%2==0)
     fw1.write(i);
     else
     fw2.write(i);
    }
    
    fr.close();
    fw1.close();
    fw2.close();
    
}
}