package _06_inheritance.bai_tap.cricle_cylinder;

public class Cricle {
    private double radius = 1.0;
    private String color ="green";

    public Cricle(){
    }
    public Cricle(double radius,String color){
        this.color=color;
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

}
