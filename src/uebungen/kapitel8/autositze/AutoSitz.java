package uebungen.kapitel8.autositze;

public class AutoSitz {

	private boolean ledersitze;
	private String farbe;
	
	
	public AutoSitz(boolean ledersitze, String farbe) throws FalscheParameter{
		
		if(ledersitze && 
			((!farbe.toLowerCase().equals("schwarz")) && (!farbe.toLowerCase().equals("weiss")))){
			throw new FalscheParameter(ledersitze, farbe);
		}
		
		this.setLedersitze(ledersitze);
		this.setFarbe(farbe);
	}


	public boolean isLedersitze() {
		return ledersitze;
	}


	public void setLedersitze(boolean ledersitze) {
		this.ledersitze = ledersitze;
	}


	public String getFarbe() {
		return farbe;
	}


	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	@Override
	public String toString() {
		return "AutoSitz - Leder: " + this.ledersitze + ", Farbe: " + this.farbe;
	}
	
}
