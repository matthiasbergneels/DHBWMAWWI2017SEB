package kapitel4;

public class LoopExamples {

	public static void main(String[] args) {
		
		int counter = 0;
		
		// Kopf gesteuerte Schleife
		while(counter <= 10){	
			if(counter % 3 == 0){
				counter++;
				continue;
			}
			
			System.out.println("Zähler ist bei: " + counter);
			counter++;
		}
		
		counter = 0;
		
		// Fuß gesteuerte Schleife
		do{
			System.out.println("Zähler ist bei: " + counter);
			counter++;
			if(counter > 5){
				break;
			}
			
		}while(counter <= 10);

		// Zählerschleife
		for(int i = 0; i <= 10; i++){
			System.out.println("Zähler ist bei: " + i);
		}
		
		
		String[] texts = {"Ich", "Du", "Er", "Sie", "Alter"};
		
		// 
		for(int i = 0; i < texts.length; i++){
			/*if(texts[i] == "Alter"){
				texts[i] = "";
			}*/
			System.out.println(texts[i]);
		}
		
		
		for(String text : texts){
			System.out.println(text);
		}
		
		
	}

}
