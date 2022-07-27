package Polymorphism;

public class Poly1Static {
	
public static void nil() {            //static Method
	System.out.println("Hi");
}
public static void nil(String s) {
	System.out.println("Hello");
}
public static void nil(char c) {
	System.out.println("Bye");
}
public static void main(String[] args) {
	nil();
	nil("h");
	nil('*');
}
}
