package Method;

public class StaticWithArgs { 
	public static void addition(int a,int b) {                     //static with Argument
		int c=a+b;
		System.out.println("addition is = "+c);
	}
	public void multiplication(int a,int b) {                      //NonStatic with Argument   
		int c=a*b;
		System.out.println("Multplication is= "+c);
	}
	
	public static void main(String[] args) {
		
		addition(56,60);
		
		StaticWithArgs x=new StaticWithArgs();
		
		x.multiplication(12,15);
		
		 
		
	}

}
