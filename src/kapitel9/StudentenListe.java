package kapitel9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class StudentenListe {

	public static void main(String[] args) {
		
		ArrayList<Student> studierendenListe = new ArrayList<Student>();
		
		studierendenListe.add(new Student(6728, "Klaus", "Mueller", 24));
		studierendenListe.add(new Student(7283, "Gabi", "Schmidt", 26));
		studierendenListe.add(new Student(7283, "Gandalf", "Graue", 86));
		studierendenListe.add(new Student(9283, "Zeus", "Goettlich", 167));
		studierendenListe.add(new Student(9283, "Eva", "goettlich", 142));
		studierendenListe.add(new Student(9283, "Adam", "Goettlich", 245));
		studierendenListe.add(new Student(9283, "Adam", "Goettlich", 256));
		studierendenListe.add(new Student(6728, "Klaus", "Mueller", 24));
		
		for(Student s : studierendenListe){
			System.out.println(s);
		}
		
		Collections.sort(studierendenListe);
		System.out.println("Sortiert - natürliche Ordnung:");
		for(Student s : studierendenListe){
			System.out.println(s);
		}
		
		Collections.sort(studierendenListe, new StudentenSortierer());
		System.out.println("Sortiert - abartig Ordnung:");
		for(Student s : studierendenListe){
			System.out.println(s);
		}

	}

}
