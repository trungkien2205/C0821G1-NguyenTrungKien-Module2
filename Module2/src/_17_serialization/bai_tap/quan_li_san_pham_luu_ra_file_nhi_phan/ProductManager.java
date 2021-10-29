package _17_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan;

import _17_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> listProduct = new ArrayList<>();
    static String pathFile = "src/_17_serialization/bai_tap/quan_li_san_pham_luu_ra_file_nhi_phan/product.csv";
    public static void addProduct(){
        System.out.println("Nhập mã sản phẩm: ");
        String productCode = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String producName = scanner.nextLine();
        System.out.println("Nhập nhà sản xuất: ");
        String producer = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        Double price = Double.valueOf(scanner.nextLine());
        System.out.println("Nhập thông tin khác của sản phẩm: ");
        String other = scanner.nextLine();
        Product product = new Product(productCode,producName,producer,price,other);
        listProduct = readFile();
        listProduct.add(product);

    }
    public static void writeFile(List<Product> list){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pathFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }
   public static List<Product> readFile(){
       List<Product> products = null;
        try{
            FileInputStream fileInputStream = new FileInputStream(pathFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
             products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
       return products;

   }
   public static void display(){
        listProduct = readFile();
       for (int i = 0; i < listProduct.size(); i++) {
           System.out.println(i + 1 + ". " + listProduct.get(i));
       }
   }
   public static void search(){
        listProduct = readFile();
       System.out.println("Nhập tên sản phẩm: ");
       String name = scanner.nextLine();
       int count = 0;
       for (int i = 0; i < listProduct.size(); i++) {
           if(name.equals(listProduct.get(i).getProducName())){
               System.out.println(listProduct.get(i));
               count++;
           }
       }
       if(count ==0){
           System.out.println("Sản phẩn không có trong danh sách. ");
       }
   }

    public static void main(String[] args) {

        int choice = -1;

        while (choice != 4){
            System.out.println("Chọn menu: ");
            System.out.println("1. Thêm sản phẩm: \n2. Hiển thị: \n3. Tìm tên sản phẩm: \n4. Thoát ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    addProduct();
                    writeFile(listProduct);
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    search();
                    break;
            }

        }

    }
}
