public class Triangle extends Shape implements Scalable {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }

    @Override
    public String toString() {
        return "Triangle with base: " + base + " and height: " + height;
    }

    @Override
    public void scale(double factor) {
        base *= factor;
        height *= factor;
    }
}