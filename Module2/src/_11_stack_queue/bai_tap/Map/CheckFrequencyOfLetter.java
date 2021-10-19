package _11_stack_queue.bai_tap.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckFrequencyOfLetter {
    public static Map<Character, Integer> checkfrequency(String string){

        char[] arr=string.toLowerCase().toCharArray();
        Map<Character,Integer> mapChar=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!mapChar.containsKey(arr[i])){
                mapChar.put(arr[i],1);
            }else {
                mapChar.replace(arr[i],mapChar.get(arr[i])+1);
            }
        }
        return mapChar;
    }

    public static void main(String[] args) {
        System.out.println("Enter thread to check:");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        for (Map.Entry<Character, Integer> entry:checkfrequency(str).entrySet()){
            System.out.println(entry);
        }
    }
}
