package kapitel11;

import kapitel9.Student;

public class LinkedListStudentenTest {

	public static void main(String[] args) {
		
		LinkedList studentenListe = new LinkedList();
		
		studentenListe.add(new Student(1234, "Gabi", "Heinz", 23) );
		studentenListe.add(new Student(7821, "Franz", "Mueller", 26) );
		studentenListe.add(new Student(8923, "Gabi", "Schmidt", 23) );
		studentenListe.add(new Student(6273, "Karl", "Heinz", 23) );

	}

}
