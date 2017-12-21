package kapitel6;

public class Hund extends Tier{
	
	private String rasse;

	public Hund(float groesse, String bezeichnung, float gewicht, String rasse) {
		super(groesse, bezeichnung, gewicht);
		
		this.setRasse(rasse);
	}
	
	@Override
	public void fressen(){
		super.fressen();
		System.out.println("Hunde fressen Fleisch.");
	}
	
	// Überladen der Methode fressen() aus Superklasse
	public void fressen(double menge){
		this.fressen();
		System.out.println( "und zwar" + menge + "kg");
	}
	
	public void bellen(){
		System.out.println("Der Hund bellt! - Wuff Wuff");
	}

	public String getRasse() {
		return rasse;
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	@Override
	public void atmen() {
		System.out.println("Der Hund atmet!");
		
	}

	
	
	
	
}
