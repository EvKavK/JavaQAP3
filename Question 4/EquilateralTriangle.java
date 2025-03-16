public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Equilateral Triangle with side: " + super.toString();
    }
}
