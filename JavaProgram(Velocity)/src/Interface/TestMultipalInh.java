package Interface;

public class TestMultipalInh implements InterfaceA,InterfaceB{

	public void Q1() {
		System.out.println("Q1 run");
	}

	public void Q2() {
		System.out.println("Q2 rub");
	}

	 public void Q3() {
		System.out.println("Q3 run");
	}

	public void Q4() {
		System.out.println("Q4 run");
	}
	public static void main(String[] args) {
		
		 TestMultipalInh x=new TestMultipalInh();
		 x.Q1();
		 x.Q2();
		 x.Q3();
		 x.Q4();
	}
}
