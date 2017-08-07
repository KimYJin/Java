package myPackage;

public abstract class PayCalculator {
	public double payRate;

	double computePay(double hours){
		return payRate*hours;
	}
	
	
}
