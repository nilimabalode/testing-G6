package String;

public class palindrom {
	public static void main(String[] args) {
		
		String n="madam";
		String rev="";
		for(int i =n.length()-1;i>=0;i--) {
			
			rev=rev+ n.charAt(i);
			
		}
		System.out.println(rev);
		if(n.equals(rev)) {
		System.out.println("String is Palindrome");
			
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		
	}

}
