package myPackage;

public class Rectangle extends Shape {
    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height; this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return String.format("Height: %.2f, Width: %.2f\n", height, width);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!(otherObject != null && otherObject instanceof Rectangle)) return false;
        Rectangle r = (Rectangle)otherObject;
        return this.height == r.height && this.width == r.width;
    }
}
