package kapitel5;

public class Car {
	
	// Definition von Attributen
	private String color;
	private String licensePlate;
	private int hp;
	private double speed;
	private boolean isCrashed;
	
	private static int carCounter = 0; 
	
	
	public Car(String color, int hp, String licensePlate){
		this.rePaint(color);
		this.setHp(hp);
		this.setLicensePlate(licensePlate);
		this.speed = 0.0;
		this.isCrashed = false;
		
		carCounter++;
	}
	
	// Definition von Methoden
	protected void accelerate(double acceleration){
		speed = speed + acceleration;
	}
	
	
	

	public void rePaint(String newColor){
		if(newColor.equals("pink") || newColor.equals("blau")){
			this.color = newColor;
		} else {
			this.color = "pink";
		}
		
	}
	
	public void setHp(int hp){
		if(hp > 50 && hp < 250){
			this.hp = hp;
		} else {
			this.hp = 90;
		}
		
	}
	
	public int getHp(){
		return this.hp;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setLicensePlate(String licensePlate){
		//TODO: Prüfe ob Übergabeparameter ein gültiges Nummernschild ist
		this.licensePlate = licensePlate;
	}
	
	public String getLicensePlate(){
		return this.licensePlate;
	}
	
	public double getSpeed(){
		return speed;
	}
	
	
	public boolean isCrashed(){
		return this.isCrashed;
	}
	
	public void crashCar(){
		this.isCrashed = true;
	}
	
	public static int getCarCounter(){
		return carCounter;
	}
	
	protected void finalize(){
		carCounter--;
		System.out.println("Verschrottet!");
	}
	
}
