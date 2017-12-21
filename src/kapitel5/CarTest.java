package kapitel5;

public class CarTest {

	public static void main(String[] args) {
		
		
		System.out.println("Es gibt " + Car.getCarCounter() + " Autos.");
		
		Car myCar = new Car("pink", 156, "HD-XX 1234");
		Car yourCar = new Car("grün", 90, "HD-YY 5678");
		
		
		
		myCar.accelerate(16);
		myCar.accelerate(5);
		myCar.accelerate(14);
		
		yourCar.accelerate(28);
		
		double currentSpeed = myCar.getSpeed();
		
		System.out.println("Geschwindigkeit myCar: " + currentSpeed);
		System.out.println("Geschwindigkeit yourCar: " + yourCar.getSpeed());
		
		//myCar.rePaint("pink");
		//yourCar.rePaint("grün");
		
		myCar.rePaint("grün");
		myCar.setLicensePlate("HH-ZZ 678");
		myCar.setHp(125);
		
		
		System.out.println(myCar.getColor());
		System.out.println(myCar.getHp());
		System.out.println(myCar.getLicensePlate());
		System.out.println(myCar.getSpeed());
		
		System.out.println("Es gibt " + Car.getCarCounter() + " Autos.");
		
		new Car("pink", 156, "HD-XX 1234");
		new Car("pink", 156, "HD-XX 1234");
		new Car("pink", 156, "HD-XX 1234");
		new Car("pink", 156, "HD-XX 1234");
		new Car("pink", 156, "HD-XX 1234");
		new Car("pink", 156, "HD-XX 1234");
		new Car("pink", 156, "HD-XX 1234");
		new Car("pink", 156, "HD-XX 1234");
		new Car("pink", 156, "HD-XX 1234");
		new Car("pink", 156, "HD-XX 1234");
		
		
		System.out.println("Es gibt " + Car.getCarCounter() + " Autos.");
		
		
		myCar = null;
		yourCar = null;
		
		
		System.gc();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Es gibt " + Car.getCarCounter() + " Autos.");
		
		
	}

}
