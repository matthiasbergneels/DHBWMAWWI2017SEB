package kapitel9;

import java.util.Comparator;

public class StudentenSortierer implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		int erg = o1.getNachname().length() - o2.getNachname().length();
		if(erg != 0){
			return erg;
		}
		
		erg = o1.getVorname().length() - o2.getVorname().length();
		if(erg != 0){
			return erg;
		}
		
		return o1.getMatrikelNummer() - o2.getMatrikelNummer();
		
	}
	
	

}
