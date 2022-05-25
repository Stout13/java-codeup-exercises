package shapes;

public class Rectangle {
    public double length = 4;
    public double width = 5;

//    public Square(double side) {
//        length = side;
//        width = side;
//    }

    public static void main(String[] args) {
    }
    public Rectangle(){
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