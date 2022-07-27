package Collection;

public class coll7global<N,A> {
	int a;
	N b;
	
	 
	N demo (A c) {
		System.out.println(c);
		return b;
	}
	public static void main(String[] args) {
		coll7global v=new coll7global();
		v.demo("nilima");
		v.demo(20);
		
	}

}
