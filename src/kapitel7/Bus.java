package kapitel7;

public class Bus implements Buchbar, Tankbar{
	
	private boolean[] sitzplaetze;
	
	public Bus(int sitzplaetze){
		this.sitzplaetze = new boolean[sitzplaetze];
		for(int i = 0; i < this.sitzplaetze.length; i++){
			this.sitzplaetze[i] = false;
		}
	}

	@Override
	public void reservieren(int anz) throws NichtGenugFreiePlaetze {
		if(anz <= this.freiePlaetze()){
			for(int i = 0; i < this.sitzplaetze.length; i++){
				if(!this.sitzplaetze[i]){
					this.sitzplaetze[i] = true;
					anz--;
				}
				if(anz <= 0){
					return;
				}
			}
		}else{
			throw new NichtGenugFreiePlaetze(this.freiePlaetze(), anz);
		}
		
	}

	@Override
	public int freiePlaetze() {
		int count = 0;
		for(boolean sitz : this.sitzplaetze){
			if(!sitz){
				count++;
			}
		}
		
		return count;
	}

	@Override
	public float aktuellerFuellstand() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void tanken(float menge) {
		// TODO Auto-generated method stub
		
	}

}

