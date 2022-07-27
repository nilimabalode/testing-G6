package Constructor;

public class sample2 {
	int a;
	int b;
	int m;
	String name;
	String Velocity;
	
	sample2()
	{
		a=50;
		b=30;
	}
	sample2(int c,int d){
		a=c;
		b=d;
	}
	sample2(int c,int d,int i){
		a=c;
		b=d;
		m=i;
	}
	public void addition() {
		System.out.println(m+a+b);
	}
	public void work() {
		System.out.println("name");
		System.out.println("Velocity");
	}
	

}
