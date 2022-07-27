package AccessSpecifier;

public class Acess1 {
	public int a=30;
	private int b=40;          //scope within the class
	protected int c=50;
	int d=60;
	
	
	public static void main(String[] args) {
		Acess1 x=new Acess1();
		
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println(x.d);
	}

}
