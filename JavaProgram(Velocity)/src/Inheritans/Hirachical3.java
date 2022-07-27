package Inheritans;

public class Hirachical3 extends Hirachical1{
	public void sub() {
		System.out.println("sub of 10 and 6= 4");
	}
     public static void main(String[] args) {
    	 Hirachical3 x=new Hirachical3();
    	 x.add();
    	 x.sub();
	}
}
