package p5;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter("console.txt"))
        ){
            String text;
            while (!(text=reader.readLine()).equals("ESC")){
                writer.write(text + "\n");
                writer.flush();
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

}
