package Collection;

import java.util.ArrayList;

public class collection2 {
	public static void main(String[] args) {
		 ArrayList <Integer>list =new ArrayList<Integer>();
		 
		 
		 list.add(45367);
		 list.add(123);
		 list.add(45);
		 list.add(23);
		  
		 int size=list.size();
		 System.out.println("size "+size);
	
		 for(int i=0;i<list.size();i++) {
		 System.out.println(list.get(i));
		 }
		 System.out.println("*************************************************************");
		 list.remove(2);
		 
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
	}

}
