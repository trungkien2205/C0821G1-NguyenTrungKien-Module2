package _15_debug_exception.bai_tap;

import _07_abstractclass_interface.bai_tap.colorable.Shape;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) throws   IllegalTriangleException {
        if (side1 >= side2 + side3)
            throw new IllegalTriangleException(side1);
        else if (side2 >= side1 + side3)
            throw new IllegalTriangleException(side2);
        else if (side3 >= side2 + side1)
            throw new IllegalTriangleException(side3);
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public static void main(String[] args) throws IllegalTriangleException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side 1: ");
        int side1 = scanner.nextInt();
        System.out.println("Input side 2: ");
        int side2 = scanner.nextInt();
        System.out.println("Input side 3: ");
        int side3 = scanner.nextInt();

        Triangle triangle = new Triangle(side1,side2,side3);
        System.out.println(triangle);
    }
}
