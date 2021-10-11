package _06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class CricleTest {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle);

            circle = new Circle(3.5);
            System.out.println(circle);

            circle = new Circle(3.5, "indigo", false);
            System.out.println(circle);
        }
    }

