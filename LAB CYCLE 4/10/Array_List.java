package newpack;
import java.util.*;
public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		
		//Adding elements to ArrayList
		obj.add("Ranbir");
		obj.add("Karan");
		obj.add("Alia");
		obj.add("Kriti");
		
		//Displaying ArrayList
		System.out.println("Original ArrayList: ");
		for(String str:obj)
		{
			System.out.println(str);
		}
		
		//Add element at given index or replace
		obj.add(2,"Arjun");
		
		//Displaying after addition 
		System.out.println("ArrayList after add operation:");
		for(String str:obj)
		{
			System.out.println(str);
		}
		
		//Remove from ArrayList
		obj.remove("Karan");
		
		//Displaying after removal
		System.out.println("ArrayList after removal:");
		for(String str:obj)
		{
			System.out.println(str);
		}
		
		//Remove element from specific index
		obj.remove(3);
		
		//Displaying after removal
		System.out.println("Final ArrayList:");
		for(String str:obj)
		{
			System.out.println(str);
		}
		
		//Sorting Arraylist
		Collections.sort(obj);
	      
	    System.out.println(" ArrayList after sorting:");
	    for (String str : obj) 
	    {
	    	 System.out.println(str);
	    }
	        
	     //returns the object of list which is present at the specified index
	      System.out.println("Object at index 2:"+obj.get(2));
	     
	      // Checks whether the object is in the ArrayList
	      System.out.println("Does 'Alia' present in Arraylist? :"+obj.contains("Alia"));
	      System.out.println("Does 'Ranbir' present in Arraylist? :"+obj.contains("Ranbir"));
	      
	      //Size of the ArrayList
	      System.out.println("Size of the ArrayList:"+obj.size());
	      
	      // remove ArrayList
	      obj.clear();      
	      System.out.println("** ArrayList Removed **");
	}

}
