package Collection;

import java.util.ArrayList;

public class collection1 {
	public static void main(String[] args) {
		 ArrayList list =new ArrayList();
		 
		 
		 list.add(45367);
		 list.add("velocity");
		 list.add('*');
		 list.add(23.87f);
		  
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
