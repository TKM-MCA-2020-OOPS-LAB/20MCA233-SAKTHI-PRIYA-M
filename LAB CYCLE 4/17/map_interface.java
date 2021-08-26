package newpack;
import java.util.*;
public class map_interface {

	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap<>();
		 
		 map.put(1,"Amsterdam");
		 map.put(2, "Budhapest");
		 map.put(3, "Capetown");
		 System.out.println("Printing initial map: "+map);
		 
		 map.put((3),"Chicago");
		 map.put((2), "Beijing");
		 System.out.println("Updated map: "+map);
		 
		 map.remove(1);
		 System.out.println("Map after removal: "+map);
	}

}
