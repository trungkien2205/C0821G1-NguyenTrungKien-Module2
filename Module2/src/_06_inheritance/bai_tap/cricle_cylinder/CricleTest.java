package _06_inheritance.bai_tap.cricle_cylinder;

public class CricleTest {
    public static void main(String[] args) {
        Cricle cricle= new Cricle();
        System.out.println(cricle);
        cricle=new Cricle(5,"red");
        System.out.println(cricle.getArea());
    }
}
