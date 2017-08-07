package myPackage;

public class PayDemo {

	public static void main(String[] args) {
		
		PayCalculator p1 = new RegularPay(50);
		PayCalculator p2 = new HazardPay(50);
		
		System.out.println(p1.computePay(2.0));
		System.out.println(p2.computePay(2.0));
	}

}
