package p2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        String text = "Hello all!!!!";
        try(FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
            PrintStream stream = new PrintStream(fileOutputStream);
        ){
            stream.println(text);
            System.out.println("DONE");
        }catch (IOException exception){
            exception.printStackTrace();
        }

        try(PrintStream stream = new PrintStream("d.txt")){
            stream.print("HELLO");
            stream.println("_HELLO");
            stream.printf("Info: %s \n", "Alex");
            String mess = "PStream";
            byte[] messBytes = mess.getBytes();
            stream.write(messBytes);

            System.out.println("DONE");
        }catch (IOException exception){
            exception.printStackTrace();
        }

        try(PrintWriter printWriter = new PrintWriter(System.out)){
            printWriter.println("Test");
        }
    }
}
