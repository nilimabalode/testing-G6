package Inheritans;

public class Super1 extends Super{
	int a=10;
	
	
	public void test() {
		
		int a=20;
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		Super1 x=new Super1();
		x.test();
	}

}
