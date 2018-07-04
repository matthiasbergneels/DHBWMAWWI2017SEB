package uebungen.kapitel8.autositze;

public class TestAutoSitzeException {

	public static void main(String[] args) throws Exception{
	
		AutoSitz[] sitze = new AutoSitz[3];
		
		try{
			sitze[0] = new AutoSitz(false, "Pink");
			sitze[2] = new AutoSitz(true, "lila");
			sitze[1] = new AutoSitz(true, "Schwarz");
		}catch(FalscheParameter e){
			System.out.println(e.getMessage());
			//throw new Exception("Neue Exception weitergeben!");
		}finally{
			int count = 0;
			for(AutoSitz sitz : sitze){
				if(sitz != null){
					count++;
				}
			}
			System.out.println("Es wurde(n) " + count + " Sitz(e) erstellt!");
		}
		
		
		for(AutoSitz sitz : sitze){
			if(sitz != null){
				System.out.println(sitz);
			}
		}
		

	}

}
