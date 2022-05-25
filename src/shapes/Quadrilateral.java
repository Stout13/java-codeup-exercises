package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

//    protected properties for length and width.
    public Quadrilateral(double side) {
        this.length = side;
        this.width = side;
    }
    public Quadrilateral(double len, double wid) {
        this.length = len;
        this.width = wid;
    }
    public void setLength(double len) {
        this.length = len;
    }
    public void setWidth(double wid) {
        this.length = wid;
    }
    public double getLength() {
        return this.length;
    }
    public double getWidth() {
        return this.width;
    }
//    a constructor that accepts two numbers for the length and width and sets those properties.
//    methods for getting the length and width.
//    abstract methods for setting the length and width.
}
