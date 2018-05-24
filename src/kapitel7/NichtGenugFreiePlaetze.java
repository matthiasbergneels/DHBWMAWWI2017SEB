package kapitel7;

public class NichtGenugFreiePlaetze extends Exception {
	
	
	public NichtGenugFreiePlaetze(int freiePlaetze, int angefragtePlaetze){
		super("Es sind nicht genuegend Plaetze frei - es wurden " + angefragtePlaetze 
				+ " Plaetze angefragt. Uebrig sind " + freiePlaetze + " Plaezte.");
	}

}
