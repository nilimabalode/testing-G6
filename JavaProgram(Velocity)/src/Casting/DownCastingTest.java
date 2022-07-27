package Casting;

public class DownCastingTest {
	public static void main(String[] args) {
		System.out.println("*********************SUPER CLASS**********************");
		 DownCasting1 d=new DownCasting1();
		 d.demo();
		 d.set();
		 d.statictest();
		 
		 System.out.println("*********************SUB CLASS**********************");
		 DownCasting2 d1=new DownCasting2();
		 d1.demo();
		 d1.set();
		 d1.statictest();    //non override
		 d1.sub();
		 
		 System.out.println("********************UP CASTING**********************");
		 DownCasting1 d2=new  DownCasting1();
		 d2.demo();
		 d2.set();
		 d2.statictest();
		 
		 System.out.println("********************DOWN CASTING**********************");
		 //DownCasting2 sub=( DownCasting2 )new  DownCasting1 ();
		// sub.demo();
		 
	}
	

}
