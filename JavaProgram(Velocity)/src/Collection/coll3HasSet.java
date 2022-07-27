package Collection;

import java.util.HashSet;

public class coll3HasSet {
public static void main(String[] args) {
	HashSet<Character>set=new HashSet<Character>();
	
	set.add('@');
	set.add('#');
	set.add('$');
	set.add('%');
	set.add('&');
	
	for(char r:set) {
		System.out.println(r);
	}
}
}
