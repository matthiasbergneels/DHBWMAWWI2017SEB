package kapitel9;

public class GleichUndGleich {

	public static void main(String[] args) {
		
		Student s1 = new Student(1234, "Klaus", "Gleich", 25);
		Student s2 = new Student(1234, "Klaus", "Gleich", 30);
		Student s3 = s1;
		
		System.out.println("s1.hashCode: " + s1.hashCode());
		System.out.println("s2.hashCode: " + s2.hashCode());
		System.out.println("s3.hashCode: " + s3.hashCode());
		
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1.equals(s2): " + (s1.equals(s2)));
		
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s1.equals(s3): " + (s1.equals(s3)));
		
		System.out.println("s2 == s3: " + (s2 == s3));
		System.out.println("s2.equals(s3): " + (s2.equals(s3)));

	}

}
