package myPackage;

public class PolynomialDemo {

	public static void main(String[] args) {

		// E.g., P(x) = 3 + 5x + 2x3
		Polynomial p = new Polynomial(3);
		
		p.setConstant(0,3);
		p.setConstant(1,5);
		p.setConstant(2,0);
		p.setConstant(3,2);
		
		System.out.println(p.evaluate(2));
		
		
	}

}
