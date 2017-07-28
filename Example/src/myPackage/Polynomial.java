package myPackage;
/*Represents: P(x) = a + a1x + a2^2 + a3^4 ...

 * Attributes (private)
degree: n (integer)
Coefficients(계수): array of (n+1) values for a0, … , an (double)

 * Methods
Polynomial(max): creates with degree max; sets coefficients to 0
setConstant(i, value): sets coefficient ai
evaluate(x): returns the value of polynomial for given x

  E.g., P(x) = 3 + 5x + 2x3
*/
public class Polynomial {
	private int degree;
	private double[] coeff = null;
	
	public Polynomial(int max){
		 degree=max;
		 coeff = new double[degree+1];
		 
		 for(int i=0; i <= degree; i++)
			 coeff[i] = 0.0;	 
	}
	
	public void setConstant(int i, double value){
		if(i>degree || i<0)
			return;
		
		coeff[i]=value;
	}
	public double evaluate(double x){
		double result=0.0;
		
		for(int i=0; i <= degree; i++)
		{
			result += coeff[i]*Math.pow(x,i);
		}
		
		return result;
	}
}
