package kapitel7;

public class Hotel implements Buchbar{
	
	private int anzahlZimmer;
	private int belegteZimmer;
	
	public Hotel(int anzahlZimmer){
		this.anzahlZimmer = anzahlZimmer;
		this.belegteZimmer = 0;
	}

	@Override
	public boolean reservieren(int anz){
		if(anz < (this.anzahlZimmer - this.belegteZimmer)){
			this.belegteZimmer += anz;
			return true;
		}else{
			return false;
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
