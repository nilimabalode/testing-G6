package Inheritans;

public class Super2 extends Super1 { 
	int a=30;
     
	
	public void next() {
		
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
	public static void main(String[] args) {
		 Super2 x=new Super2();
		 x.next();
		 x.test();
	}
}
