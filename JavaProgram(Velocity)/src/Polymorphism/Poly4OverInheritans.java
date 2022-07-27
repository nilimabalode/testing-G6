package Polymorphism;

public class Poly4OverInheritans extends Poly3Override{
	public  void nil() {
		System.out.println("Nil is not Working");
		System.out.println("OverRride");
	}
	public static void main(String[] args) {
		Poly4OverInheritans x=new Poly4OverInheritans();
		x.nil();
	}

}
