package kapitel7.clone;

public class SchafKlonMaschine {

	public static void main(String[] args) {
		
		Schaf dolly = new Schaf("Dolly", 5);
		
		try{
			Schaf cloneDolly = (Schaf)dolly.clone();
			cloneDolly.setAlter(0);
			System.out.println("Schaf - " + dolly.getName() + ", Alter " + dolly.getAlter());
			System.out.println("Schaf - " + cloneDolly.getName() + ", Alter " + cloneDolly.getAlter());
		}catch(Exception e){
			System.out.println("Da ist etwas schief gegangen!");
		}
		
		
	}

}
