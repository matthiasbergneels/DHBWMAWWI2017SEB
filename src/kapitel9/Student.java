package kapitel9;

public class Student implements Comparable<Student>{
	
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
				+ this.getNachname();
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

	@Override
	public int compareTo(Student o) {
		
		//TODO Fiese Klausuraufgabe nicht vergessen!
		//return this.getMatrikelNummer() - o.getMatrikelNummer();
		
		// Sortierung nach: Nachname, Vorname und Alter
		int erg = this.getNachname().toLowerCase().compareTo(o.getNachname().toLowerCase());
		if(erg != 0){
			return erg;
		}
		
		erg = this.getVorname().compareTo(o.getVorname());
		if(erg != 0){
			return erg;
		}
		
		return this.getAlter() - o.getAlter();
	}
	
	@Override
	public boolean equals(Object obj) {
		// Alias check
		if(this == obj){
			return true;
		}
		
		// Null check
		if(obj == null){
			return false;
		}
		
		//Type check
		if(obj.getClass() != this.getClass()){
			return false;
		}
		
		// Attribut Check
		Student s = (Student)obj;
		
		if(!this.getNachname().equals(s.getNachname())){
			return false;
		}
		
		if(!this.getVorname().equals(s.getVorname())){
			return false;
		}
		
		return this.getAlter() == s.getAlter();
	}
	
	@Override
	public int hashCode() {
		return this.getNachname().hashCode() ^ this.getVorname().hashCode() ^ this.getAlter();
	}
	
	

}
