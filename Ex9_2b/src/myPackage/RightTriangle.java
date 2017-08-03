package myPackage;

public class RightTriangle extends Shape{
	
	private double height, width;
	
	public RightTriangle(double height, double width)
	{
		this.height = height;
		this.width = width;
	}
	
	public double getArea(){
		return height*width*0.5;
	}
	
	@Override
	public String toString() {
		return String.format("Height: %.2f, Width: %.2f\n", height, width);
	}
	    
	
	 @Override
	 public boolean equals(Object otherObject) {
		 if (!(otherObject != null && otherObject instanceof RightTriangle)) return false;
		 
		 RightTriangle r = (RightTriangle)otherObject;
	        
	        return this.height == r.height && this.width == r.width;
	 }
}
