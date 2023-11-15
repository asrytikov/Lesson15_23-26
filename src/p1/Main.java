package p1;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String text = "Hello all!";
        byte[] bytes = text.getBytes();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);

        try(BufferedInputStream stream = new BufferedInputStream(inputStream)) {
            int c;
            while ((c=stream.read())!=-1){
                System.out.print((char) c);
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }

        try(FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
            BufferedOutputStream stream = new BufferedOutputStream(fileOutputStream)
        ){
            stream.write(bytes, 0, bytes.length);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
