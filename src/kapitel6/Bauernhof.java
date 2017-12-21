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
		
		Vogel tweety = new Vogel(4.5f, "Tweety", 3.0f, true);
		
		tweety.atmen();
		tweety.bewegen();
		tweety.fressen();
		tweety.zwitscher();
		
		
		

	}

}
