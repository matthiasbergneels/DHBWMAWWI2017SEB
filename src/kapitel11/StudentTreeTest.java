package kapitel11;

import kapitel9.Student;

public class StudentTreeTest {

	public static void main(String[] args) {
		
		StudentTree studentenBaum = new StudentTree();
		
		studentenBaum.insert(new Student(1234, "Felix", "Mueller", 25));
		studentenBaum.insert(new Student(7829, "Klaus", "Mueller", 25));
		studentenBaum.insert(new Student(5263, "Gabi", "Mueller", 25));
		studentenBaum.insert(new Student(6718, "Ralf", "Mueller", 25));
		studentenBaum.insert(new Student(8293, "Alex", "Mueller", 25));
		studentenBaum.insert(new Student(1562, "Bernd", "Mueller", 25));
		
		System.out.println("Suche 6718: " + studentenBaum.find(6718));
	}

}
