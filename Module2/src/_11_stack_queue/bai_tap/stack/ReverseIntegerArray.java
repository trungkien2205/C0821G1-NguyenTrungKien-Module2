package _11_stack_queue.bai_tap.stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseIntegerArray<E>{
    public static void main(String[] args) {
        Stack<Integer> stacks=new Stack<>();
        int [] array={1,2,3,4,5};
        for(int i=0;i<array.length;i++){
            stacks.push(array[i]);
        }
        System.out.println("First array"+ Arrays.toString(array));
        for(int i=0;i<array.length;i++){
            array[i]=stacks.pop();
        }
        System.out.println("Last array" + Arrays.toString(array));

    }


}
