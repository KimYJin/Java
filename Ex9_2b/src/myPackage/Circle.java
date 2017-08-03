package myPackage;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}	
	
	public double getArea(){
		return radius*radius*pi;
	}
	
	@Override
	public String toString() {
		return String.format("radius: %.2f\n",radius);
	}
	    
	
	 @Override
	 public boolean equals(Object otherObject) {
		 if (!(otherObject != null && otherObject instanceof Circle)) return false;
		 
		 Circle r = (Circle)otherObject;
	        
	        return this.radius == r.radius;
	 }
}