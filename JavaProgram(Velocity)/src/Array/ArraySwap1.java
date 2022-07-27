package Array;

public class ArraySwap1 {
	public static void main(String[] args) {
		int a[]= {45,67,87,65,32,90};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		for(int i=0;i<(a.length/2);i++) {
			int z;
			z=a[i];
			a[i]=a[(a.length-1)-i];
			a[(a.length-1)-i]=z;
			
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}

}
