public class EquilateralTriangle extends Triangle {
    private double side;
    
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }
    
    @Override
    public double getPerimeter() {
        return 3 * side;
    }
}