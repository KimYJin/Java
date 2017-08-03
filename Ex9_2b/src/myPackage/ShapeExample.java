package myPackage;

public class ShapeExample {

	public static void main(String[] args) {
		Shape[] a = {
				new Rectangle(10,5), 
				new Rectangle(10,5),
				new RightTriangle(7,8),
				new Circle(11)
				};
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i].toString());
		}
		
		System.out.println("\nRectangle1 and Rectangle2 are equal: "+ a[0].equals(a[1]));
		System.out.println("Right Triangle and Circle are equal: "+ a[2].equals(a[3]));
	}

}
