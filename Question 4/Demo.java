public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Ellipse ellipse = new Ellipse(6.0, 3.0);
        Triangle triangle = new Triangle(3.0, 4.0);
        EquilateralTriangle eqTriangle = new EquilateralTriangle(4.0);

        Scalable[] shapes = { circle, ellipse, triangle, eqTriangle };

        System.out.println("Before scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        scaleShapes(shapes, 2.0);

        System.out.println("\nAfter scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}