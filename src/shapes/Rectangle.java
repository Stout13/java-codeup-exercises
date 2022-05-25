package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double len, double wid) {
        super(len, wid);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
//    public double length = 4;
//    public double width = 5;
//
//    public static void main(String[] args) {
//        Rectangle tangle = new Rectangle();
//        Rectangle untangle = new Rectangle(7, 7);
//    }
//    public Rectangle(){
//    }
//    public Rectangle(double len, double wid) {
//        length = len;
//        width = wid;
//    }
//    public double getPerimeter(){
//        return this.length*2 + this.width*2;
//    }
//    public double getArea(){
//        return this.length*this.width;
//    }
//    public void setDimension(double len, double wid) {
//        this.length = len;
//        this.width = wid;
//    }
}