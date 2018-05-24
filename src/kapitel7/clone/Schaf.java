package kapitel7.clone;

public class Schaf implements Cloneable{

	private String name;
	private int alter;
	private boolean lebendig;
	
	public Schaf(String name, int alter){
		this.setName(name);
		this.setAlter(alter);
		this.setLebendig(true);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public boolean isLebendig() {
		return lebendig;
	}
	public void setLebendig(boolean lebendig) {
		this.lebendig = lebendig;
	}
	
	
}
