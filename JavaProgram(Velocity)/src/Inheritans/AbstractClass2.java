package Inheritans;

public  class AbstractClass2 extends AbstractClass1 {          //concrate class
	public void sub() {
		System.out.println("Show mwthod running");           //complete method  declare body
	}
	public void test() {
		System.out.println("blank method running");           //complete method  declare body
	}

	public static void main(String[] args) {
		AbstractClass2 x=new AbstractClass2 ();
		x.test();
	    x.sub();
		x.add();
		 
	}
	
	
	

}
