package Method;

public class StaticNonstatic {
	static int a=10;                   //static variable
	       int b=20;                   //non static variable
	       
	       StaticNonstatic(){
	    	   a=23;
	    	   b=56;
	    	  
	    	   
	       }
	       public static void main(String[] args) {
			System.out.println(a);
			//System.out.println(b);
			
			
		}

}
