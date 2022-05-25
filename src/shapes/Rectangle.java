package shapes;

public class Rectangle {
    public double length = 4;
    public double width = 5;

//    public Square(double side) {
//        length = side;
//        width = side;
//    }

    public static void main(String[] args) {
        Rectangle tangle = new Rectangle();
        Rectangle untangle = new Rectangle(7, 7);
    }
    public Rectangle(){
    }
    public Rectangle(double len, double wid) {
        length = len;
        width = wid;
    }
    public double getPerimeter(){
        return this.length*2 + this.width*2;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public void setDimension(double len, double wid) {
        this.length = len;
        this.width = wid;
    }
}