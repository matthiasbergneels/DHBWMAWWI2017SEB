package kapitel9;

import java.util.ArrayList;
import java.util.Iterator;

import kapitel6.Fisch;
import kapitel7.Bus;

public class ListenBeispiel {

	public static void main(String[] args) {
		
		
		ArrayList<String> meineListe = new ArrayList<String>();
		
		meineListe.add("Klaus");
		//meineListe.add(new Bus(100));
		//meineListe.add(new Fisch(30f, "Fischi", 20f, true));
		meineListe.add("Gabi");
		meineListe.add("Fritz");
		
		System.out.println("Objekt an der Stelle 2: " + meineListe.get(2));

		for(int i = 0; i < meineListe.size(); i++){
			System.out.println("Objekt an der Stelle "+i+": " + meineListe.get(i));
		}
		
		meineListe.remove(3);
		
		Iterator<String> meinListenIterator = meineListe.iterator();
		
		while(meinListenIterator.hasNext()){
			String o = meinListenIterator.next();
			//meinListenIterator.remove();
			System.out.println(o);
		}
		
		for(String o : meineListe){
			System.out.println(o);
		}
	}

}
