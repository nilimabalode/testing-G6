package Array;

import java.util.Arrays;

public class AssendingArray {
	public static void main(String[] args) {
		
	
	int ar[]= {10,60,30,20,50};
	
	System.out.println("*********Orijinal info from array************");
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	Arrays.sort(ar);
	System.out.println("*********Array in assending order************");
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
		
	}
	System.out.println("*********Array in Decenging order************");
	
	for(int i=ar.length-1;i>=0;i--) {
		System.out.println(ar[i]);
		
	}
}
}