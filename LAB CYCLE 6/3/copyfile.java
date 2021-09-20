package CO6;
import java.io.*;
import java.util.*;
public class copyfile {

	
	    public static  void main(String[] args) throws Exception{
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the path of the source file");
	        String src=sc.next();
	        System.out.println("Enter the path of the destination file:");
	        String dst=sc.next();
	        System.out.println("Copying........");
	        FileReader ra= new FileReader(src);
	        FileWriter wr =new FileWriter(dst,true);
	        int c;
	        while((c= ra.read()) !=-1){
	            wr.write(c);

	        }
	        System.out.println("Copied........");
	        ra.close();
	        wr.close();
	    }
	}