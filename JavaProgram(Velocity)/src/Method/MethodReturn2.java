package Method;

public class MethodReturn2 {
	static int demo()
		{
			int x=10;
			int y=20;
			int z=x+y;
			return z;
			
		}
	static String test() {
		return"Welcome Velocity";
		
	}
	public static void main(String[] args) {
		int m=demo();
		
		String x=test();
		
		System.out.println(m);
		System.out.println(x);
	}
	 
	
		
	
}


