package _11_stack_queue.bai_tap.stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class ReverseStringArray {
    public static void main(String[] args) {
        Stack<String> wStack=new Stack<>();

        String mWord="Nguyen Trung Kien";

        String[] array=mWord.split("");

        for(int i=0;i<mWord.length();i++){
            wStack.push(array[i]);
        }
        System.out.println("First String:" + mWord);
        for(int i=0;i<mWord.length();i++){
            array[i]=wStack.pop();
        }
        String lastWord = "";
        for(int i=0;i<array.length;i++){
            lastWord+=array[i];
        }
        System.out.println("Last String:" + lastWord);
    }
}
