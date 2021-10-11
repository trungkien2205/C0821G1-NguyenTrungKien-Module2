package _06_inheritance.bai_tap.cricle_cylinder;

public class Cylinder extends Cricle{
    private double height=2.0;

    public Cylinder(){
    }

    public Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return getArea()*height;
    }
    @Override
    public String toString(){
        return "A Cylinder with height="
                + getHeight()
                + super.toString();
    }
}
