package ScannerClass;
import java.util.Scanner;
public class Scanner1{
	 public static void main(String[] args) {
	    Scanner demo=new Scanner(System.in);         //scanner class object
		System.out.println("Enter The Integer");
		int value=demo.nextInt();
		int b=demo.nextInt();
		System.out.println("you Enter Value is   "+(value+b));
		String c=demo.next();
		System.out.println("String is  "+c);
	}

}
