public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(1.0f, 2.0f);
        System.out.println(p1);
        p1.setXY(3.0f, 4.0f);
        System.out.println(p1);
        
        MovablePoint mp1 = new MovablePoint(5.0f, 6.0f, 0.7f, 0.8f);
        System.out.println(mp1);
        System.out.println(mp1.move());
        mp1.setSpeed(9.0f, 10.0f);
        System.out.println(mp1);
        System.out.println(mp1.move());
    }
}