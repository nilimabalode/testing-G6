package Collection;

import java.util.Hashtable;
import java.util.Map;

public class coll5HashTable {
public static void main(String[] args) {
		
		Hashtable<Integer,String> map=new Hashtable<>();
		map.put(34, null);
		map.put(12, "sneha");
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
