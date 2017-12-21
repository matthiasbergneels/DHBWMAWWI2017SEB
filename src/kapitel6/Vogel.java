package kapitel6;

public class Vogel extends Tier {

	private boolean fliegen;
	
	public Vogel(float groesse, String bezeichnung, float gewicht, boolean fliegen) {
		super(groesse, bezeichnung, gewicht);
		
		this.setFliegen(fliegen);
	}
	
	public void zwitscher(){
		System.out.println("Der Vogel zwitschert - Zirp Zirp");
	}

	public boolean isFliegen() {
		return fliegen;
	}

	public void setFliegen(boolean fliegen) {
		this.fliegen = fliegen;
	}
	
	@Override
	public void atmen(){
		System.out.println("Der Vogel atmet.");
	}
	
	
}
