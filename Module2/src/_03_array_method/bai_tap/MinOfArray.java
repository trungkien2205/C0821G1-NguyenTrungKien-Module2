package _03_array_method.bai_tap;
import java.util.Scanner;
public class MinOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        int array[];
        do {
            System.out.println("Enter size");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("size should not exceed 20");
                continue;
            }
        }while (size>20);
        array=new int[size];
        for (byte i=0;i<size;i++){
            System.out.println("Enter element: "+ (i+1));
            array[i]=scanner.nextInt();
        }
        System.out.println("array: ");
        for(byte i=0; i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
        int min;
        min=array[0];
        for(int i=1; i<array.length; i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("min is: "+ min);

    }
}
