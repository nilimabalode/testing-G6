package String;

public class StringMethod {
	public static void main(String[] args) {
		
		
		String s1="nilima";
		String s2="Nilima";
		String s3="Balode";
		
		
		System.out.println(s1.charAt(0));           //to print character at any index
		System.out.println(s2.replace("N", "J"));   //to replace char
		System.out.println(s2.isEmpty());	        //to check the string is empty or not  
		System.out.println(s2.concat(s3));          //to join 2 String
	    System.out.println(s3.substring(2));        //to remove the some char
	    System.out.println(s2.substring(3, 5));     //first take char from starting and next it remove index   
	    System.out.println(s2.endsWith("ma"));       //it check test senetive or not 
	    System.out.println(s1.startsWith("ni"));
	    System.out.println(s1.lastIndexOf("m"));      //check last index
	    System.out.println(s2.indexOf("l"));
	    System.out.println(s2.contains(s3));          //check char are same or not
	    System.out.println(s1.equals(s2));
	    System.out.println(s2.equalsIgnoreCase(s1));
	    System.out.println(s2.length());
	    System.out.println(s1.toLowerCase());
	    System.out.println(s2.toUpperCase());
	    System.out.println(s1.isBlank());
	    System.out.println(s2.matches(s3));
	    System.out.println(s3.replace(s2, s1));
	    System.out.println(s2.startsWith(s3));
	    
	    
	    
	}
	

}
