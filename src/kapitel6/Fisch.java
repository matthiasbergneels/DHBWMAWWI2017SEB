package kapitel6;

public class Fisch extends Tier {

	private boolean knorpelfisch;
	
	public Fisch(float groesse, String bezeichnung, float gewicht, boolean knorpelfisch) {
		super(groesse, bezeichnung, gewicht);
		this.setKnorpelfisch(knorpelfisch);
	}

	public void blubbern(){
		System.out.println("Der Fisch blubbert. Blub Blub");
	}

	public boolean isKnorpelfisch() {
		return knorpelfisch;
	}

	public void setKnorpelfisch(boolean knorpelfisch) {
		this.knorpelfisch = knorpelfisch;
	}
	
	@Override
	public void atmen(){
		System.out.println("Der Vogel atmet.");
	}
	
}
