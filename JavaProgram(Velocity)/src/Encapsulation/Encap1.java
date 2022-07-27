package Encapsulation;

public class Encap1 extends Encapsulation1{
	public static void main(String[] args) {
		Encap1 x=new Encap1();
		int y=x.get();
		System.out.println(y);
		Encap1.set(15);
	}

}
