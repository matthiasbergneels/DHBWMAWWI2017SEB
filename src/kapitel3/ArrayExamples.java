package kapitel3;

public class ArrayExamples {

	public static void main(String[] args) {
		
		
		int[] numberArray;				// Array Deklaration kenntlich durch eckige Klammern
		
		
		numberArray = new int[5];
		
		numberArray[0] = 26;
		numberArray[3] = 13;
		numberArray[4] = 66;
		
		System.out.println(numberArray[1]);
		
		double digitNumberArray[] = {5.5, 4.3, 88.9, 66.7, 100.5, 77.9};
		
		System.out.println(digitNumberArray[0]);
		System.out.println(digitNumberArray[4]);
		System.out.println(digitNumberArray.length);
		
		
		int twoDimensionNumbers[][] = new int[3][3];
		
		twoDimensionNumbers[1][1] = 3;
		twoDimensionNumbers[2][0] = 4;
		
		
		double threeDimensionNumbers[][][] = new double[3][][];
		
		threeDimensionNumbers[0] = new double[4][];
		
		threeDimensionNumbers[0][0] = new double[5];
		threeDimensionNumbers[0][1] = new double[10];
		threeDimensionNumbers[0][2] = new double[3];
		threeDimensionNumbers[0][3] = new double[66];
		
		threeDimensionNumbers[1] = new double[10][];
		
		
		String textElements[][] = {
									{"Banane", "Apfel", "Birne"},
									{"Teller", "Tasse"},
									{"Reifen", "Lenkrad", "Motor", "Scheibe"}
								};
		
		System.out.println(textElements.length);
		System.out.println(textElements[0].length);
		System.out.println(textElements[1].length);
		System.out.println(textElements[2].length);
		
		
		
		
		

	}

}
