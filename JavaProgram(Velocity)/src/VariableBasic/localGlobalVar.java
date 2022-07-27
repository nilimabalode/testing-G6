package VariableBasic;

public class localGlobalVar {
	
	int a=90;              //global variable
	public void demo() {
		int b=80;          //local variable
		System.out.println(a);
		System.out.println(b);
	}
	public void demo1() {
        int  c=70;
        System.out.println(a);
        System.out.println(c);
}
	public static void main(String[] args) {
		localGlobalVar x=new localGlobalVar();
		x.demo();
		x.demo1();
		
	}
}