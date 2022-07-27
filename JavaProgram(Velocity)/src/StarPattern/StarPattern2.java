package StarPattern;

public class StarPattern2 { 
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {             //outer loop it only work for goes to next line
			for(int a=1;a<4;a++) {          // column
				System.out.print("*");
		}
		System.out.println("*");
	}

}
}