package kapitel4;

public class AdditionalOperators {

	public static void main(String[] args) {

		int numberA = 35;
		int numberB = 16;
		
		//(numberA > numberB) ? (numberA - numberB) : (numberB - numberA);

		boolean isTired = false;
		
		String whatToDo = isTired ? "Bleib im Bett liegen" : "Steh auf";
		
		System.out.println(whatToDo);
		
		
		String text1 = "Hello";
		String text2 = "Klaus";
		
		String greeting = text1 + " " + text2 + "! Voll Super.";
		
		System.out.println(greeting);
		
		String newText =  numberA + numberB + greeting + (numberA + numberB);
		
		System.out.println(newText);
	
		
	}

}
