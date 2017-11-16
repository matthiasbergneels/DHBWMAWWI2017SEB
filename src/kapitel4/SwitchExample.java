package kapitel4;

public class SwitchExample {

	public static void main(String[] args) {
		
		int grade = 0;
		
		switch(grade){
			case 1: 
				System.out.println("Sehr Gut");
				System.out.println("Gibt es das überhaupt?");
				break;
			case 2: 
				System.out.println("Gut");
				break;
			case 3: 
				System.out.println("Befriedigend");
				System.out.println("Das ist nicht so der Renner");
				break;
			case 4: 
				System.out.println("Ausreichend");
				break;
			case 5: 
				System.out.println("Mangelhaft");
				break;
			default:
				System.out.println("Diese Note gibt es nicht!");
		}

	}

}
