package _15_debug_exception.bai_tap;

public class IllegalTriangleException extends Exception {
    private double perimeter;


    public IllegalTriangleException(double perimeter) {
        super("The sum of any two sides is greater than the other side" + perimeter);
        this.perimeter = perimeter;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
