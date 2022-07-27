package Inheritans;

public class This {
	int a=20;                                       //global variable
	 public void add() {
		 int a= 10;                                 //local variable
		
		 
		 System.out.println(a);                     //local variable
		 System.out.println(this.a);                //global variable
	 }
	 public static void main(String[] args) {
		
		 This x=new This();
		 x.add();
	}

}
