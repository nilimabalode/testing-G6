package Inheritans;

public class son extends father {
	public  void Bike() {
		System.out.println("Bike");
	}
	public static void main(String[] args) {
		son x=new son();
		x.Money();
		x.Bike();
		x.Car();
		x.Home();
		}
	

}
