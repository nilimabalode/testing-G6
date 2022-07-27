package Polymorphism;

public class Poly3MOverload {
	public void Addition(int a,int b) {
		System.out.println("add is = "+(a+b));
	}
	public void Addition(int a,int b,int c) {
		System.out.println("add is = "+(a+b+c));
	}
     public static void main(String[] args) {
    	 Poly3MOverload x=new Poly3MOverload();
    	 x. Addition(10,20);
    	 x. Addition(10,20,30);
	}

}
