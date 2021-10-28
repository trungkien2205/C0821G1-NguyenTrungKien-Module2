package _16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFileText {
    public static void copyFile(String pathFile, String pathFileCopy) {
        try {
            File file = new File(pathFile);

            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFileCopy,true));
            String line = "";
            while ((line = bufferedReader.readLine())!= null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();


        }catch (Exception e){
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }

    }

    public static void main(String[] args) {
        copyFile("src/_16_io_text_file/bai_tap/copy_file_text/country.csv","src/_16_io_text_file/bai_tap/copy_file_text/numbercopy.csv" );
    }
}
