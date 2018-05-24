package kapitel8;

import kapitel7.clone.Schaf;

public class BeispielAusnahmen {

	public static void main(String[] args) {
		
		int[] zahlen = new int[5];
		
		zahlen[0] = 3;
		
		try{
			// ==> ArrayIndexOutOfBoundsException
			zahlen[6] = 6;

			Schaf dolly = null;
			//==> NullPointerException
			//System.out.println(dolly.getAlter());

			int a = 6; 
			int b = 0;
			// ==> ArithmeticException
			System.out.println(a/b);
			
		}catch(ArithmeticException e){
			System.out.println("Fehlertext: " + e.getMessage());
			System.out.println("Du bist zu dumm zum rechnen!");
		}catch(Exception e){
			System.out.println("Fehlertext: " + e.getMessage());
			if(e instanceof ArrayIndexOutOfBoundsException){
				System.out.println("Fehler: ArrayIndexOutOfBoundsException");
			}
		}
			
		System.out.println("Ende vom Programm");
	}

}
