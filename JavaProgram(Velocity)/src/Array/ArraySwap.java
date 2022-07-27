package Array;

public class ArraySwap {
	public static void main(String[] args) {
		int a=45;
		int b=76;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=b;
		System.out.println("b="+b);
		System.out.println("a="+a);
		System.out.println("************************************************");
		int x;                       //backup of b in x=45
		x=a;                         //76  
		a=b;                         //45  
		b=x;
		System.out.println("b="+b);
		System.out.println("a="+a);
	
}

}
