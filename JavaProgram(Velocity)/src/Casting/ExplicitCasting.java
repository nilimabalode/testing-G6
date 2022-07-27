package Casting;

public class ExplicitCasting {
	public static void main(String[] args) {
		
		double a=145.5;                //Memory Size 8 Byte
		System.out.println(a);
		
		int b=(int)a;                 //Memory Size 4 Byte   //Casting Operator     
		System.out.println(b);
		
		byte c=(byte)b;               //Memory Size 1 Byte
		System.out.println(c);
	}

}
