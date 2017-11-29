package kapitel5;

public class Car {
	
	// Definition von Attributen
	String color;
	String licensePlate;
	int hp;
	double speed;
	
	// Definition von Methoden
	void accelerate(double acceleration){
		speed = speed + acceleration;
	}
	
	double getSpeed(){
		return speed;
	}
	

	void rePaint(String newColor){
		color = newColor;
	}
	
}
