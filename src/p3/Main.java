package p3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("file.txt", false)){
            String text = "Hello all";
            writer.write(text);
            writer.append('\n');
            writer.append('E');
            writer.flush();
        }catch (IOException exception){
            exception.printStackTrace();
        }

        try(FileReader fileReader = new FileReader("file.txt")){
            int c;
            while ((c=fileReader.read())!=-1){
                System.out.print((char) c);
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }

        try(FileReader reader = new FileReader("file.txt")){
            char[] buf = new char[256];
            int c;
            while ((c= reader.read(buf))>0){
                if (c<256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.println(buf);
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
