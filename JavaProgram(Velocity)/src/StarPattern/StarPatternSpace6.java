package StarPattern;

public class StarPatternSpace6 {
	public static void main(String[] args) {
		int star=1;
		int space=4;
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=space;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=star;b++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;

}
}
}