package shapes;

public class Rectangle {
    public double length = 4;
    public double width = 5;
    public static void main(String[] args) {

    }
    public Rectangle(double len, double wid){
        length = len;
        width = wid;
    }
    public double getPerimeter(Rectangle anyBox){
        return this.length*2 + this.width*2;
    }
    public double getArea(Rectangle anyBox){
        return this.length*this.width;
    }
    public void setDimension(double len, double wid) {
        this.length = len;
        this.width = wid;
    }
}