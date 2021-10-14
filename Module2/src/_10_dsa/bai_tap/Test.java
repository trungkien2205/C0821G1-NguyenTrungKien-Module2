package _10_dsa.bai_tap;

public class Test {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>(10);
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        list.add(3, "b");
        list.add("kien");
        System.out.println(list.get(3));


    }
}