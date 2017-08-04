package myPackage;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Radius: %.2f\n", radius);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!(otherObject != null && otherObject instanceof Circle)) return false;
        Circle c = (Circle)otherObject;
        return this.radius == c.radius;
    }
}
