package shapes;

public class CircleApp {
    public static void main(String[] args) {
        Circle oval = new Circle(20);
        Circle Bob = new Circle(100);
        System.out.println(oval.getRadius());
        Bob.getArea();
        oval.setRadius();
        oval.getArea();
    }
}
