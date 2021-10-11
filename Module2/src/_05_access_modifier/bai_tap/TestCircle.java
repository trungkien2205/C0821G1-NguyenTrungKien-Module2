package _05_access_modifier.bai_tap;

public class TestCircle {
    private double radius;

    double getRadius(){
        return this.radius;
    }

    double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public static void main(String[] args) {
        Circle circle1=new Circle(5.0);

        System.out.println("The circle has radius: "+circle1.getRadius());
        System.out.println("The circle has area: "+circle1.getArea());
    }
}
