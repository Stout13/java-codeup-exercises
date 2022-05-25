package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
//
//
//    public Square(int side) {
//        length = side;
//        width = side;
//    }
//
//    public static void main(String[] args) {
//        Rectangle square = new Square(5);
//        Rectangle round = new Rectangle();
//    }
}
