package Collection;

import java.util.HashMap;
import java.util.Map;

public class coll4HashMap {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<>();
		map.put(34, "nilima");
		map.put(12, null);
		map.put(45, "testing");
		map.put(null, "nilima");
		map.put(15, "pune");
		
		for(Map.Entry<Integer,String>e:map.entrySet()) {
			System.out.println("Key "+e.getKey()+" Value "+e.getValue());
		}
		System.out.println("------------------------------------------------------");
		map.put(32, "System");

		for(Map.Entry<Integer,String>e:map.entrySet()) {
			System.out.println("Key "+e.getKey()+" Value "+e.getValue());
	}

}
}