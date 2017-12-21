package kapitel5;

public class Student {
	
	private int matrikelNr;
	private String name;
	
	public Student(String name, int matrikelNr){
		this.setMatrikelNr(matrikelNr);
		this.setName(name);
	}
	
	public void trinken(double menge){
		System.out.println(this.name + " trinkt " + menge + "l.");
		// TODO mache wilde Berechnungen..
	}
	
	public void trinken(double menge, double alkoholGehalt){
		this.trinken(menge);
		System.out.println("...und wird betrunken.");
	}
	
	public void trinken(double menge, boolean isVergiftet){
		this.trinken(menge);
		if(isVergiftet){
			System.out.println("... und stirbt.");
		}
	}
	
	public void trinken(double menge, double alkoholGehalt, boolean isVergiftet){
		this.trinken(menge, alkoholGehalt);
		if(isVergiftet){
			System.out.println("... und stirbt.");
		}
	}
	
	public int getMatrikelNr() {
		return matrikelNr;
	}
	public void setMatrikelNr(int matrikelNr) {
		this.matrikelNr = matrikelNr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
