package kapitel3;

public class VariableExamples {

	public static void main(String[] args) {
		
		int firstNumber;			//Variablen Deklaration
		
		firstNumber = 15;		// Wertzuweisung in Variable
		
		
		short secondNumber = 5;	// Deklaration und Initialisierung
		
		boolean isRaining;
		
		float digitNumber;
		
		
		final double pi;			// Deklaration einer Konstanten
		pi = 3.14;
		
		
		// Ganzzahlenliterale
		
		int number;
		
		number = 15;				// Zuweisung von Literal im 10er System
		number = 015;			// Zuweisung von Literal im Octal System (Basis 8)
		System.out.println(number);
		
		number = 0x15;			// Zuweisung von Literal im Hex System
		System.out.println(number);
		
		
		// Gleitkommazahlen Literale
		double digitDouble;
		
		digitDouble = 15.3;
		digitDouble = 15.3d;
		
		
		float digitFloat;
		
		digitFloat = 15.3f;
		
		// Boolean Literale
		
		boolean tired;
		
		tired = true;
		tired = false;
		
		// Char Literale
		
		char sign;
		
		sign = 'g';
		System.out.println(sign);
		
		sign = 111;
		System.out.println(sign);
		
		
		

	}

}
