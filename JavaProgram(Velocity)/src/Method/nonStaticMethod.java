package Method;

public class nonStaticMethod {
	public static void main(String[] args) {
		nonStaticMethod x=new nonStaticMethod();
		x.m3();
		
	}
	public void m3() {             //nonstatic method
		System.out.println("non static started");
	}

}
