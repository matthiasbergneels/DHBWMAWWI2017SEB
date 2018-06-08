package kapitel9;

public class Student {
	
	private int matrikelNummer;
	private String vorname;
	private String nachname;
	private int alter;
	
	public Student(int matrikelNummer, String vorname, String nachname, int alter){
		this.setMatrikelNummer(matrikelNummer);
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setAlter(alter);
	}
	
	@Override
	public String toString() {
		return this.getMatrikelNummer() + ": " 
				+ this.getNachname() +", " + this.getVorname()
				+ "; " + this.getAlter();
	}
	
	public int getMatrikelNummer() {
		return matrikelNummer;
	}
	public void setMatrikelNummer(int matrikelNummer) {
		this.matrikelNummer = matrikelNummer;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	

}
