package ScannerClass;

import java.util.Scanner;

public class scanner2 {
	public static void main(String[] args) {
		Scanner demo=new Scanner(System.in);
		System.out.println("Enter the Integer");
		int value=demo.nextInt();
		System.out.println("You Enter Integer Value is:"+value);
		
		System.out.println("Enter the float");
		float value1=demo.nextFloat();
		System.out.println("You Enter Float Value is:"+value1);
		
		System.out.println("Enter the String");
		String value2=demo.next();
		System.out.println("You Enter String Value is:"+value2);
		
		demo.close();
	}

}
