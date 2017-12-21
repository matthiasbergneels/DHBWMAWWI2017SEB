package kapitel5;

public class CallByTest {

	public static void main(String[] args) {
		
		
		// call by value
		int a = 20;
		
		int b = a;
		
		a = 30;
		
		System.out.println(b);
		
		
		// call by reference
		
		Car myCar = new Car("blau", 150, "HD-ZZ 1234");
		
		Car borrowedCar = myCar;
		
		borrowedCar.crashCar();
		
		System.out.println("Auto kaputt? " + myCar.isCrashed());
		
		
		// String und Equals-Methode
		
		String text1 = "Hallo";
		//String text2 = "Hallo";
		
		String text2 = new String("Hallo");
		
		if(text1.equals(text2)){// ==> Böse!!!! ==> if(text1 == text2){
			System.out.println(text1 + " ist gleich " + text2);
		}else{
			System.out.println(text1 + " ist UNgleich " + text2);
		}

	}

}
