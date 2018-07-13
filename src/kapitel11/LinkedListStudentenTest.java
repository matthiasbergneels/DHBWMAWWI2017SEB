package kapitel11;

import kapitel9.Student;

public class LinkedListStudentenTest {

	public static void main(String[] args) {
		
		LinkedList studentenListe = new LinkedList();
		
		Student meinStudent = new Student(8923, "Gabi", "Schmidt", 23);
		
		studentenListe.add(new Student(1234, "Gabi", "Heinz", 23) );
		studentenListe.add(new Student(7821, "Franz", "Mueller", 26) );
		//studentenListe.add("Hallo");
		studentenListe.add(meinStudent);
		studentenListe.add(new Student(6273, "Karl", "Heinz", 23) );
		
		//studentenListe.printLinkedList();
		studentenListe.printLinkedListRecursiv();
		
		System.out.println("Gelöscht: " + studentenListe.remove(meinStudent));
		
		studentenListe.printLinkedListRecursiv();
		
		System.out.println("Gelöscht: " + studentenListe.remove(meinStudent));
	}

}
