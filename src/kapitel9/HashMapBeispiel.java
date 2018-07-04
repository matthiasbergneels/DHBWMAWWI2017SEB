package kapitel9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapBeispiel {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> studentenMap = new HashMap<Integer, Student>();
		
		studentenMap.put(new Integer(4711), new Student(4711, "Klaus", "Michels", 35));
		studentenMap.put(4813, new Student(4813, "Gabi", "Hirsch", 25));
		studentenMap.put(9912, new Student(9912, "Gandalf", "Graue", 89));

		System.out.println("Anzahl Werte: " + studentenMap.size());
		System.out.println("Matrikelnr 9912: " + studentenMap.get(9912));
		
		Set<Integer> schluessel = studentenMap.keySet();
		System.out.println(schluessel.getClass());
		
		Iterator<Integer> i = schluessel.iterator();
		while(i.hasNext()){
			int einSchluessel = i.next();
			System.out.println("Student fuer Matrikelnr " 
					+ einSchluessel + ": " + studentenMap.get(einSchluessel));
		}
		
	}

}
