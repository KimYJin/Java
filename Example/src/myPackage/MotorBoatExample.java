package myPackage;

public class MotorBoatExample {

	public static void main(String[] args) {
		
		MotorBoat motorBoat1 = new MotorBoat();
		
		motorBoat1.setFuelAmount(300);
		motorBoat1.setCurrentSpeed(50);
		motorBoat1.setEfficiency(5.0);
		
		motorBoat1.printFuelAmount(3);
		motorBoat1.printTravelDistance(3);
		motorBoat1.printTravelDistance();
		
		MotorBoat motorBoat2 = new MotorBoat();
		motorBoat1.setFuelAmount(500);
		motorBoat1.setCurrentSpeed(40);
		motorBoat1.setEfficiency(3.0);
		
		boolean result = motorBoat1.equals(motorBoat2);
		System.out.println(result);
	}

}
