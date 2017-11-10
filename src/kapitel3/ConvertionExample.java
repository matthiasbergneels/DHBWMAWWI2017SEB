package kapitel3;

public class ConvertionExample {

	public static void main(String[] args) {
		
		int bigNumber = 256;
		
		byte smallNumber = 15;
		
		// bigNumber = smallNumber;
		
		smallNumber = (byte)bigNumber;
		
		System.out.println(smallNumber);
		
		double digitNumber = 15.8;
		
		bigNumber = (int)digitNumber;
		
		System.out.println(bigNumber);

	}

}
