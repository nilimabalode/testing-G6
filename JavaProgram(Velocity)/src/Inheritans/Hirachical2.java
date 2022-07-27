package Inheritans;

public class Hirachical2 extends Hirachical1 {
	public void mul() {
	int a=12;
	int b=12;
	int c=a*b;
	System.out.println(c);

}
	public static void main(String[] args) {
		Hirachical2 x=new Hirachical2();
		x.add();
		x.mul();
	}
}