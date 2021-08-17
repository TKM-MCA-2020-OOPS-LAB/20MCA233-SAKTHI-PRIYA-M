package newpack;

import java.util.*;

class check_username extends Exception
{
	
	check_username(String message)
	{
		super(message);
		System.out.println("Username Failed");
	}
}

class check_pass extends Exception
{
	
	check_pass(String message)
	{
		super(message);
		System.out.println("Password Failed");
	}
}

class error extends Exception
{
	error()
	{
		super("Username and Password Does not Match..!!!");
		System.out.println("\nLogin Failed");
		
	}
}



public class login {
	
	public static void main(String[] args)
	{
		int count =0;
		String c_usr,c_pass;
		int usr_success = 0;
		int pass_success = 0;
		Scanner inp1 = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("   	 SIGN UP PAGE           ");
		System.out.println("-----------------------------\n");
		System.out.println("Enter UserName : ");
		c_usr = inp1.nextLine();
		
		try
		{
			if(c_usr.length() < 5)
			{
				throw new check_username("Minimum Characters Should Be 5");

			}
			if(c_usr.contains(" "))
			{
				throw new check_username("No Space is Allowed");
				
			}
			else
			{
				System.out.println("\n***** Username stored successfully..!!! *****");
				System.out.println(" ");

				usr_success = 1; 
				
			}
			
		}
		catch(check_username e)
		{
			System.out.println(e.getMessage());
			
			
		}
		
		
		if(usr_success == 1)
		{
			
		System.out.println("Enter password : ");
		c_pass = inp1.nextLine();
		
		try
		{
			if(c_pass.length() < 6) // to check length
			{
				throw new check_pass(" Minimum Characters Should Be 6");
			}
			if(c_pass.contains(" ")) // containing space
			{
				throw new check_pass(" No Space Allowed");
			}
			
			if(true) // containing digits
			{
				
				for(int i=0;i<10;i++)
				{
					String str1 = Integer.toString(i);
					
					if(c_pass.contains(str1))
					{
						count = 1;
					}
				}
			}
			if(count == 0 )
			{
				throw new check_pass("password should contain digits(0-9) !! ");
			}
			
			// special characters
			if (!(c_pass.contains("@") || c_pass.contains("#")
		              || c_pass.contains("!") || c_pass.contains("~")
		              || c_pass.contains("$") || c_pass.contains("%")
		              || c_pass.contains("^") || c_pass.contains("&")
		              || c_pass.contains("*") || c_pass.contains("(")
		              || c_pass.contains(")") || c_pass.contains("-")
		              || c_pass.contains("+") || c_pass.contains("/")
		              || c_pass.contains(":") || c_pass.contains(".")
		              || c_pass.contains(", ") || c_pass.contains("<")
		              || c_pass.contains(">") || c_pass.contains("?")
		              || c_pass.contains("|"))) 
				{
				
				throw new check_pass("Should contain atleast one special  character ..!!");
		           
		        }
			
			
			if (true) {
	             count = 0;
	  
	            // checking capital letters
	            for (int i = 65; i <= 90; i++) {
	  
	                // type casting
	                char c = (char)i;
	  
	                String str1 = Character.toString(c);
	                if (c_pass.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	        		throw new check_pass("Should contain atleast one Capital Letter(A-Z)");
	            }
	        
			}
			
			if (true) {
	            count = 0;
	  
	            // checking small letters
	            for (int i = 90; i <= 122; i++) {
	  
	                // type casting
	                char c = (char)i;
	                String str1 = Character.toString(c);
	  
	                if (c_pass.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	            	throw new check_pass("Should contain atleast one Small Letter (a-z)");
	            }
	        }
			
			pass_success = 1;
			
			System.out.println("\n *****  password stored successfully..!!! *****");
			
			System.out.println(" ");
			
			System.out.println(" ===== Signed Up Successfully =====");
			System.out.println(" ");
			
			
			
			
		}
		catch(check_pass e)
		{
			System.out.println(e.getMessage());
		}
		
		
		if(pass_success == 1)
		{
		System.out.println("-----------------------------");
		System.out.println("   	  Login Page           ");
		System.out.println("-----------------------------");
		
		String us , pass;
		
		
		System.out.println("Enter Username : ");
		us = inp1.next();
		System.out.println("Enter password : ");
		pass = inp1.next();
		
		
		try {
			if(c_usr.equals(us) && c_pass.equals(pass))
			{
				System.out.println("\n #####  Log in  Successfull #####");
			}
			else
			{
				throw new error();
			}
		}
		catch( error e)
		{
			System.out.println(e.getMessage());
		}
		
		}
		}
			
		
	}

}
