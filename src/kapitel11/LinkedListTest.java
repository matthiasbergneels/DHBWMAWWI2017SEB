package kapitel11;

import kapitel9.Student;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList studentenListe = new LinkedList();
		
		studentenListe.add(new Student(1234, "Klaus", "Mueller", 35) );
		studentenListe.add(new Student(6727, "Gabi", "Franz", 35) );
		studentenListe.add(new Student(7637, "Moni", "Mayer", 35) );

	}

}
