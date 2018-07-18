package kapitel11;

import kapitel9.Student;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Student> studentenSchlange = new Queue<Student>();
		
		
		studentenSchlange.enqueue(new Student(8727, "Klaus", "Mueller", 23));
		studentenSchlange.enqueue(new Student(8293, "Klaus", "Mueller", 23));
		studentenSchlange.enqueue(new Student(1728, "Klaus", "Mueller", 23));
		studentenSchlange.enqueue(new Student(3627, "Klaus", "Mueller", 23));
		studentenSchlange.enqueue(new Student(4212, "Klaus", "Mueller", 23));

		System.out.println("Anzahl Elemente in Schlange: " + studentenSchlange.size());
		System.out.println("Schlange abarbeiten: " + studentenSchlange.dequeue());
		System.out.println("Schlange abarbeiten: " + studentenSchlange.dequeue());
		System.out.println("Schlange abarbeiten: " + studentenSchlange.dequeue());
		System.out.println("Anzahl Elemente in Schlange: " + studentenSchlange.size());
	}

}
