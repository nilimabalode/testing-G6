package DataTypes;

public class dataTyp1 { 
	public static void main(String[] args)
	{
		boolean stdPass=false;        //  Conditional DTonly true or false output
		byte stdMaxMarks=100;         //  value from -128 to 127
		short stdTotalMarks=900;      //  value from -32768 to32767
		int stdRollNo=925468552;      //  greater than short value
		long stdMobNo=90966684844L;   //  L is mandatory when we declare long
		double stdAvgMarks=99.12;     //  use for fractional number max 15 digit
		float stdPerc=51.1f;          //  f is mandatory
		char grade='A';               //
		
		System.out.println(stdPass);
		System.out.println(stdMaxMarks);
		System.out.println(stdTotalMarks);
		System.out.println(stdRollNo);
		System.out.println(stdMobNo);
		System.out.println(stdAvgMarks);
		System.out.println(stdPerc);
		System.out.println(grade);
		
	}

}
