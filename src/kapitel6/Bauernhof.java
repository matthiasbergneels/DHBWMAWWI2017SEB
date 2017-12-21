package kapitel6;

public class Bauernhof {

	public static void main(String[] args) {
		
		/*
		Tier einTier = new Tier(50.3f, "Irgendein Tier", 13.3f);
		
		einTier.atmen();
		einTier.bewegen();
		einTier.fressen();
		
		// einTier.bellen(); !! Gibt es nicht!
		*/
		
		Hund bello = new Hund(33.3f, "Bello", 9.5f, "Mops");
		
		bello.atmen();
		bello.bewegen();
		bello.fressen();
		bello.fressen(15.0);
		bello.bellen();
		
		Tier einTier = bello;
		
		Hund meinHund = (Hund)einTier;
		
		
		
		
		//Object einObjekt = bello;
		
		
		Vogel tweety = new Vogel(4.5f, "Tweety", 3.0f, true);
		
		tweety.atmen();
		tweety.bewegen();
		tweety.fressen();
		tweety.zwitscher();
		
		
		Tier[] stall = new Tier[4];
		
		// Narrowing Cast
		stall[0] = bello;
		stall[1] = tweety;
		stall[2] = new Hund(51.4f, "Tango", 78.0f, "Schäferhund");
		stall[3] = new Vogel(4.5f, "Hugo", 3.0f, true);
		
		System.out.println("Durch den Stall gehen!");
		
		for(Tier tier : stall){
			System.out.println("Neue Box öffnen");
			tier.atmen();
			tier.bewegen();
			tier.fressen();
			
			// tier.bellen(); --> geht nicht!
			// tier.zwitschern(); --> geht nicht!
			
			if(tier instanceof Hund){
				// Widening Cast!
				Hund hund = (Hund)tier;
				hund.bellen();
			}

		}
		
		

	}

}
