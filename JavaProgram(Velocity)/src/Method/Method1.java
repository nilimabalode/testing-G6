package Method;

public class Method1{ 
	
	static void demo()                           //regular method use for define
	{
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Start");
		demo();                                   //declare in same class &call in same class
	    System.out.println("d");
	    demo();
	    System.out.println("e");
	    demo();
	    System.out.println("main method end");
	    
	}
	
	
		
	}

