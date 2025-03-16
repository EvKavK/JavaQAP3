public class Ellipse extends Shape implements Scalable {
    private double semiMajorAxis;
    private double semiMinorAxis;

    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    @Override
    public double area() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    @Override
    public double perimeter() {
        return Math.PI * (3 * (semiMajorAxis + semiMinorAxis) - Math.sqrt((3 * semiMajorAxis + semiMinorAxis) * (semiMajorAxis + 3 * semiMinorAxis)));
    }

    @Override
    public String toString() {
        return "Ellipse with semi-major axis: " + semiMajorAxis + ", semi-minor axis: " + semiMinorAxis;
    }

    @Override
    public void scale(double factor) {
        semiMajorAxis *= factor;
        semiMinorAxis *= factor;
    }
}