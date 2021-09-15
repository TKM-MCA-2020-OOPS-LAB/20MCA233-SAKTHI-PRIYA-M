package CO6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class writefile {

		 public static void main(String[] args) {

		  try
		  {
	          FileWriter writer = new FileWriter("D:\\new\\abc\\testfile.txt",true);
	          writer.write("HELLO WORLD! WELCOME ALL!!");
	          writer.close();
	          
	          FileReader reader = new FileReader("D:\\new\\\\abc\\\\testfile.txt");
	          BufferedReader br= new BufferedReader(reader);
	          
	          String str;
	          System.out.println("**Displaying the contents of the file** ");
	          while ((str = br.readLine()) != null) 
	          {
	              System.out.println(str);
	          }
	          reader.close();

	      } 
		  catch (IOException e) 
		  {
	          System.out.println(e.getMessage());
	      }

	  }


	}
