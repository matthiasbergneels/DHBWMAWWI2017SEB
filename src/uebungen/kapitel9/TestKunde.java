package uebungen.kapitel9;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class TestKunde {

	public static void main(String[] args) {
		
		// Initialisierung der Kunden
		Kunde[] initialeKunden = {
				new Kunde("Mustermann", "Klaus", 4711),
				new Kunde("Beispiel", "Hans", 5180),
				new Kunde("Mustermann", "Hilde", 4712),
				new Kunde("Vorbild", "Theodor", 8278),
				new Kunde("Dummy", "Jimmy", 1111)
		};
		
		// Aufgabe 1
		
		// Kundenverzeichnis als Menge (Set) anlegen
		Set<Kunde> kundenVerzeichnis = new TreeSet<Kunde>();
		
		// Initial angelegte Kunden in neues Kundenverzeichnis (Menge) übertragen
		for(Kunde zuzuweisenderKunde : initialeKunden){
			kundenVerzeichnis.add(zuzuweisenderKunde);
		}
		
		
		// Kundenverzeichnis über Iterator auslesen
		System.out.println("Ausgabe der Sortierten Kundenmenge:");
		Iterator<Kunde> kundenIterator = kundenVerzeichnis.iterator();
		
		while(kundenIterator.hasNext()){
			System.out.println(kundenIterator.next());
		}
		
		
		// Aufgabe 2
		
		// Kundenverzeichnis als Liste (List) anlegen
		List<Kunde> kundenVerzeichnisNachName = new Vector<Kunde>();
		
		// Initial angelegte Kunden in neues Kundenverzeichnis (Liste) übertragen
		for(Kunde zuzuweisenderKunde : initialeKunden){
			kundenVerzeichnisNachName.add(zuzuweisenderKunde);
		}
		
		// Sortieren der Liste nach spezifischer Sportiervorschrift
		Collections.sort(kundenVerzeichnisNachName, new KundenSortiererNachNameVornameKundennummer());;
		
		// Kundenverzeichnis über Iterator auslesen
		System.out.println("Ausgabe der Sortierten Kundenliste:");
		kundenIterator = kundenVerzeichnisNachName.iterator();
		
		while(kundenIterator.hasNext()){
			System.out.println(kundenIterator.next());
		}
		
		

	}

}
