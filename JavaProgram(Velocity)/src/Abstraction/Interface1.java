package Abstraction;

public interface Interface1 {
	void mart();                         //incomplete Method of interface
	
	default void Dmart() {               //default Method
		System.out.println("Shopping");
	}

}
