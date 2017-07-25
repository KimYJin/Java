package myPackage;

public class MotorBoat {

	//	Capacity of fuel tank (C), Amount of fuel in the tank (f)
	//	Maximum speed (M), Current speed (s)
	//	Efficiency of the boat¡¯s motor (e)
	
	//  Make tank capacity (C) and maximum speed (M) constants
	public static final double tankCapacity=500.0;
	public static final double maximumSpeed =80.0;
	
	private double fuelAmount;
	private double currentSpeed;
	private double efficiency;
	
	
	//Make all other instance variables private, and implement their getter/setter methods
	public void setCurrentSpeed(double currentSpeed)
	{
		if(currentSpeed > maximumSpeed)
			System.out.println("Error.");
		else
			this.currentSpeed = currentSpeed;
	}
	public double getCurrentSpeed()
	{
		return currentSpeed;
	}
	
	public void setFuelAmount(double fuelAmount)
	{
		if(fuelAmount > tankCapacity)
			System.out.println("Error.");
		else
			this.fuelAmount = fuelAmount;
	}
	public double getFuelAmount()
	{
		return fuelAmount;
	}
	
	public void setEfficiency(double efficiency)
	{
		this.efficiency=efficiency;
	}
	public double getEfficiency()
	{
		return efficiency;
	}
	
	
	//Given a parameter (time t), 
	//print the amount of fuel used at the maximum and current speeds (e*s2*t)
	//Given a time t, print the travel distance (s*t)
	//For current speed s and fuel amount f, print the travel distance
    public void printFuelAmount(int time) {
        System.out.println("Amount of fuel used at the maximum speed: " +
            efficiency * maximumSpeed * maximumSpeed * time);
        System.out.println("Amount of fuel used at the current speed: " +
            efficiency * currentSpeed * currentSpeed * time);
    }

    public void printTravelDistance(int time) {
        System.out.println("Travel distance at the maximum speed: " +
            maximumSpeed * time);
        System.out.println("Travel distance at the current speed: " +
            currentSpeed * time);
    }

    public void printTravelDistance() {
        System.out.println("Travel distance at the current speed & fuel amount: " +
            fuelAmount / (efficiency * currentSpeed));
    }
}
