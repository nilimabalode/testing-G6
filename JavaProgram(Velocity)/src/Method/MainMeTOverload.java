package Method;

public class MainMeTOverload {
	
	public static void main(int a) {
		
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		System.out.println("Main Method is Started");
		main(20);
		
		main('@');
	}
	public static void main(char b) {
		System.out.println(b);
	}

}
