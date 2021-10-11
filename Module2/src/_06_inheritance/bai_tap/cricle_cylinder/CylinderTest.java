package _06_inheritance.bai_tap.cricle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        cylinder=new Cylinder(2,1,"red");
        System.out.println(cylinder.getVolume());
    }
}
