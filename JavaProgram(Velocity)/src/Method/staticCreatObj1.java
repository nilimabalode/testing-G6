package Method;

public class staticCreatObj1 {
	static int a=20;
	
	public static void main(String[] args) {
		staticCreatObj1 x1=new staticCreatObj1();
		staticCreatObj1 x2=new staticCreatObj1();
		staticCreatObj1 x3=new staticCreatObj1();
		
		System.out.println(x1.a);
		System.out.println(x2.a);
		System.out.println(x3.a);
		
		x3.a=30;
		
		System.out.println(x3.a);
		System.out.println(x2.a);
		System.out.println(x3.a);
		
		
		
	}

}
