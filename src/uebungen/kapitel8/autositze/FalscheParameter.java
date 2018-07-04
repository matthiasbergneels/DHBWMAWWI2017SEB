package uebungen.kapitel8.autositze;

public class FalscheParameter extends Exception{

	public FalscheParameter(boolean ledersitze, String farbe){
		super("Die Konfiguration Ledersitze: " + ledersitze 
					+ " und Farbe: " + farbe + " ist nicht erlaubt!");
		
	}
}
