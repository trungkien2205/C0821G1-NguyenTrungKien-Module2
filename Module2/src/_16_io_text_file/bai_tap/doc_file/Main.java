package _16_io_text_file.bai_tap.doc_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {

            File file = new File("src/_16_io_text_file/bai_tap/doc_file/country.csv" );
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        }catch (Exception e){
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
