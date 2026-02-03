
package Lec10_Abstraction;

public class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double calculateArea() {
        return side * side;
    }
}

