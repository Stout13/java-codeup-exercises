package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle();
        System.out.println(box1.length + " length " + box1.width + " width " + box1.getArea() + " Area " + box1.getPerimeter() + " Perimeter ");
        Rectangle box2 = new Square(5);
        System.out.println(box1.length + " length " + box2.width + " width " + box2.getArea() + " Area " + box2.getPerimeter() + " Perimeter ");
    }
}