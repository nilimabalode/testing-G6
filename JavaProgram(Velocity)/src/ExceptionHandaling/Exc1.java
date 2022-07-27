package ExceptionHandaling;

public class Exc1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		int d[]= {10,20,52,25};
		
		System.out.println("Start");
		try {
		c=a/b;
		System.out.println(d[8]);
		}
		catch(ArithmeticException e) {
			System.out.println("Alternativ Code");
			b=2;
			c=a/b;
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound");
		}
		System.out.println(c);
		System.out.println(d[2]);
		
	}

}
