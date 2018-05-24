package kapitel7;

public class Hotel implements Buchbar{
	
	private int anzahlZimmer;
	private int belegteZimmer;
	
	public Hotel(int anzahlZimmer){
		this.anzahlZimmer = anzahlZimmer;
		this.belegteZimmer = 0;
	}

	@Override
	public void reservieren(int anz) throws NichtGenugFreiePlaetze{
		if(anz < (this.anzahlZimmer - this.belegteZimmer)){
			this.belegteZimmer += anz;
		}else{
			throw new NichtGenugFreiePlaetze(this.freiePlaetze(), anz);
		}
	}

	@Override
	public int freiePlaetze() {
		return this.anzahlZimmer - this.belegteZimmer;
	}
	
	/* 
	
	... andere Methoden ...
	
	*/
}
