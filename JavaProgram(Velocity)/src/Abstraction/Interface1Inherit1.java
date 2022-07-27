package Abstraction;

public class Interface1Inherit1 implements Interface1{
	public void mart() {
		System.out.println("Shopping Open");
	}
	public static void main(String[] args) {
		Interface1Inherit x=new Interface1Inherit();
		Interface1Inherit1 y=new Interface1Inherit1();
		x.mart();
		x.Dmart();
		y.mart();
		y.Dmart();
		
	}

}
