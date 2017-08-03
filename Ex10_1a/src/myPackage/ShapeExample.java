package myPackage;

public class ShapeExample {
    public static void main(String[] args) {
        Shape[] shape = new Shape[]
            { new Rectangle(10, 20), new RightTriangle(10, 20), new Circle(15) };
        for (int i = 0; i < shape.length; i ++) {
            System.out.print(shape[i]);
        }
    }
}
