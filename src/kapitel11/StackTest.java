package kapitel11;

import kapitel9.Student;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<Student> studentenStapel = new Stack<Student>();
		
		
		studentenStapel.push(new Student(1234, "Klaus", "Mueller", 35));
		studentenStapel.push(new Student(8728, "Klaus", "Mueller", 35));
		studentenStapel.push(new Student(7281, "Klaus", "Mueller", 35));
		studentenStapel.push(new Student(7892, "Klaus", "Mueller", 35));
		
		
		System.out.println("Erstes Element anschauen: " + studentenStapel.peek());
		
		System.out.println("Stapel abbarbeiten: " + studentenStapel.pop());
		System.out.println("Stapel abbarbeiten: " + studentenStapel.pop());
		System.out.println("Stapel abbarbeiten: " + studentenStapel.pop());
		
	}

}
