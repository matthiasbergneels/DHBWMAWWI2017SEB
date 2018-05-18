package kapitel7;

public interface Buchbar {

	public boolean reservieren(int anz);
	public int freiePlaetze();
	public default int gesamtePlaetze(){
		return 1000;
	}
	
}
