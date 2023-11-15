import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int a;
        System.out.println("Copy png file");
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("2.png");
            FileInputStream fileInputStream = new FileInputStream("1.png");
            a = fileInputStream.read();
            while (a!=-1){
                fileOutputStream.write(a);
                a = fileInputStream.read();
            }
            fileOutputStream.close();
            fileInputStream.close();
            System.out.println("File is copied");
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}