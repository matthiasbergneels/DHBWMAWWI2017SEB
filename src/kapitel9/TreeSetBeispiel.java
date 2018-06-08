package kapitel9;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBeispiel {

	public static void main(String[] args) {
		
		TreeSet<Student> studierendenListe = new TreeSet<Student>();
		
		studierendenListe.add(new Student(6728, "Klaus", "Mueller", 24));
		studierendenListe.add(new Student(7283, "Gabi", "Schmidt", 26));
		studierendenListe.add(new Student(7283, "Gandalf", "Graue", 86));
		studierendenListe.add(new Student(9283, "Zeus", "Goettlich", 167));
		studierendenListe.add(new Student(6728, "Klaus", "Mueller", 24));
		
		System.out.println("Anzahl Studierende: " + studierendenListe.size());
		
		Iterator<Student> studierendenListeIterator = studierendenListe.iterator();
		
		while(studierendenListeIterator.hasNext()){
			Student studierendes = studierendenListeIterator.next();
			System.out.println(studierendes);
		}
		

	}

}
