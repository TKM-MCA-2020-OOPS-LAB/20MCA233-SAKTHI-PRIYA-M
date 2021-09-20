package CO6;
import java.net.*;
import java.io.*; 
public class Server {
	public static void main(String[] args) throws Exception {
		try {
			ServerSocket ss = new ServerSocket(3467);
			System.out.println("SERVER IS WAITING FOR THE CLIENT");
			Socket sk = ss.accept();
			System.out.println("CONNECTION ESTABLISHED !!!");
			InputStreamReader isr = new InputStreamReader(sk.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			System.out.println("MESSAGE FROM CLIENT: "+str);
			PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
			pw.println("HI CLIENT!!");
			pw.close();
		}
		catch(Exception e) {
			System.out.println("An error occured.."+e);
		}
	}
}
	
