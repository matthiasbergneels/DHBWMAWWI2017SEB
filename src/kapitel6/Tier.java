package kapitel6;

public abstract class Tier {

	private float groesse;
	private String bezeichnung;
	private float gewicht;
	
	public Tier(float groesse, String bezeichnung, float gewicht){
		this.setBezeichnung(bezeichnung);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
	}
	
	public void fressen(){
		System.out.println("Das Tier frisst.");
	}
	
	public final void bewegen(){
		System.out.println("Das Tier bewegt sich.");
	}
	
	public abstract void atmen();
	
	
	public float getGroesse() {
		return groesse;
	}
	public void setGroesse(float groesse) {
		this.groesse = groesse;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public float getGewicht() {
		return gewicht;
	}
	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	}
	
	
}
