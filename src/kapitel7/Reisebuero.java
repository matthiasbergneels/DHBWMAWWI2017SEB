package kapitel7;

public class Reisebuero {

	public static void main(String[] args){
		
		Buchbar[] buchbar = new Buchbar[3];
		
		buchbar[0] = new Hotel(50);
		buchbar[1] = new Bus(100);
		buchbar[2] = new Bus(8);
		
		for(int i = 0; i < buchbar.length; i++){
			System.out.println("Freie Plaetze vor der Reservierung: " + buchbar[i].freiePlaetze());
			try{
				buchbar[i].reservieren(10);
				System.out.println("Reservierung erfolgreich!!");
				
			}catch(NichtGenugFreiePlaetze e){
				System.out.println(e.getMessage());
				System.out.println("Bitte neu buchen oder etwas anderes raus suchen!");
			}finally{
				System.out.println("Ich werde immer ausgeführt!!! :P");
			}
			System.out.println("Freie Plaetze nach der Reservierung: " + buchbar[i].freiePlaetze());
			
			if(buchbar[i] instanceof Tankbar){
				Tankbar etwasTankbares = (Tankbar)buchbar[i];
				etwasTankbares.tanken(100.0f);
			}
		}

	}

}
