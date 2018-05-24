package kapitel7;

public interface Buchbar {

	public void reservieren(int anz) throws NichtGenugFreiePlaetze;
	public int freiePlaetze();
	public default int gesamtePlaetze(){
		return 1000;
	}
	
}
