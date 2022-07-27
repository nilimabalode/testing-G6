package Polymorphism;

public class Poly2NonStatic {
	public  void nil() {            //static Method
		System.out.println("Hi 123");
	}
	public  void nil(String s) {
		System.out.println("Hello");
	}
	public  void nil(char c) {
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		Poly2NonStatic x=new Poly2NonStatic();
		x.nil();
		x.nil("h");
		x.nil('*');
	}
	}



