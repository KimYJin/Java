package myPackage;

public class HazardPay extends PayCalculator{
	
	public HazardPay(double payRate){
		this.payRate = payRate;
	}

	@Override
	public double computePay(double hours){
		return 1.5*super.computePay(hours);
	}
	

}
