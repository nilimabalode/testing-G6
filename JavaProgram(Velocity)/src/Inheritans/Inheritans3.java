package Inheritans;

public class Inheritans3 extends Inheritans2 {         //multilevel Inheritans
	public void sucess() {
		System.out.println("Corporate World");
	}
	public static void main(String[] args) {
		Inheritans3 v=new Inheritans3();
		
		v.test();
		v.development();
		v.sucess();
	}

}
