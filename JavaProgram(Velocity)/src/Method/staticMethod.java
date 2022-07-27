package Method;

public class staticMethod {                         //static method call from same class
	public static void m1()
	{
		System.out.println("Main Method Started");
	}
	public static void m2() {
		System.out.println("Main Method Ended");
	} 
	public static void main(String[] args) {
		System.out.println("Static method from m1");
		m1();
		m2();
		System.out.println("Static method from m2");
	}
}
