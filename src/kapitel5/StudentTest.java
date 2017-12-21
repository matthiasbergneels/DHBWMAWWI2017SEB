package kapitel5;

public class StudentTest {

	public static void main(String[] args) {
		
		Student myStudent = new Student("Klaus", 12345);
		
		
		myStudent.trinken(0.5);
		myStudent.trinken(0.5, 0.05);
		myStudent.trinken(0.5, 0.05, true);

	}

}
