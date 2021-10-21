package _12_java_collection_framework.bai_tap.arraylist_linkedlist_javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
    ArrayList list=new ArrayList();

    public static void addProduct(ArrayList<Product> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap san Pham");
        String product = sc.nextLine();
        System.out.println("Nhap gia");
        double price = sc.nextDouble();
        Product myproduct = new Product(id, product, price);
        arrayList.add(myproduct);
    }

    public static void editProduct(ArrayList<Product> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vị tri muon sua");
        int index = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap san Pham");
        String product = sc.nextLine();
        System.out.println("Nhap gia");
        double price = sc.nextDouble();
        Product myproduct = new Product(id, product, price);
        arrayList.set(index, myproduct);
    }

    public static void deleteProduct(ArrayList<Product> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vị tri muon xoa");
        int index = Integer.parseInt(sc.nextLine());
        arrayList.remove(index);
    }

    public static void displayproduct(LinkedList<Product> linkedList) {
        for (Product product : linkedList) {
            System.out.println(product);
        }
    }

    public static void searchproduct(LinkedList<Product> linkedList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vij tri muon sua");
        String product = sc.nextLine();
        for (Product product1 : linkedList) {
            if (product1.getName() == product) {
                System.out.println(product1.toString());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> myProduct=new ArrayList<>();

        myProduct.add(new Product(01,"Milk",20000));
        myProduct.add(new Product(02,"Tea",30000));
        myProduct.add(new Product(03,"Cake",40000));
        myProduct.add(new Product(04,"Sugar",10000));

        addProduct(myProduct);
        for (Product e: myProduct) {
            System.out.println(e);
        }
        deleteProduct(myProduct);
        for (Product e: myProduct) {
            System.out.println(e);
        }
    }

}