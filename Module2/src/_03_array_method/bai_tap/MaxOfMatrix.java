package _03_array_method.bai_tap;
import java.util.Scanner;
public class MaxOfMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter column size");
        byte col=scanner.nextByte();
        System.out.println("Enter row size");
        byte row=scanner.nextByte();
        int matrix[][]=new int[row][col];
        for (byte i=0; i<row;i++){
            for (byte j=0; j<col;j++){
                System.out.println("enter element of Matrix id ["+i+"]["+j+"]");
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Your Matrix");
        for (byte i=0; i<row;i++){
            for (byte j=0; j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        int max=matrix[0][0];
        for (byte i=0; i<row;i++){
            for (byte j=0; j<col;j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("Max is: "+max);
    }
}
