package kapitel4;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		
		int numberA = 15;
		int numberB = 2;
		
		double result;
		
		result = (double)numberA / ++numberB;
		System.out.println(result);
		System.out.println(numberB);
		
		result = numberA % numberB;			// Restwert der Division
		System.out.println(result);
		
		
		numberA++;
		
		System.out.println(--numberA);

		
		
		

	}

}
