package kapitel5;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car yourCar = new Car();
		
		
		
		myCar.accelerate(16);
		myCar.accelerate(5);
		myCar.accelerate(14);
		
		yourCar.accelerate(28);
		
		double currentSpeed = myCar.getSpeed();
		
		System.out.println("Geschwindigkeit myCar: " + currentSpeed);
		System.out.println("Geschwindigkeit yourCar: " + yourCar.getSpeed());
		
		myCar.rePaint("pink");
		yourCar.rePaint("grün");
		
		myCar.licensePlate = "HD-XY 1243";
		myCar.hp = 156;
		
		System.out.println(myCar.color);
		System.out.println(myCar.hp);
		System.out.println(myCar.licensePlate);

	}

}
