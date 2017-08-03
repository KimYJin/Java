package myPackage;

public class RightTriangle extends Shape {
    private double height, width;

    public RightTriangle(double height, double width) {
        this.height = height; this.width = width;
    }

    @Override
    public double getArea() {
        return height * width / 2.0;
    }

    @Override
    public String toString() {
        return String.format("Height: %.2f, Width: %.2f\n", height, width);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!(otherObject != null && otherObject instanceof RightTriangle)) return false;
        RightTriangle t = (RightTriangle)otherObject;
        return this.height == t.height && this.width == t.width;
    }
}
