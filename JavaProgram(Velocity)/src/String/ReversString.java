package String;

public class ReversString {
	public static void main(String[] args) {
		 String a="nilima";
		 String rev="";
		
		 for(int i=a.length()-1;i>=0;i--) {
		 
			 rev=rev+a.charAt(i);
			 
			 
		 }
		 System.out.println(rev);
	}

}
