package p4;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dat.txt"))){
            String text = "HEllo Data file.HEllo Data file.HEllo Data file.HEllo Data file";
            bufferedWriter.write(text);
        }catch (IOException exception){
            exception.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("dat.txt"))){
            int c;
            while ((c=reader.read())!=-1){
                System.out.print((char) c);
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
        System.out.println();

        try(BufferedReader reader = new BufferedReader(new FileReader("dat.txt"))){
            String c;
            while ((c=reader.readLine())!=null){
                System.out.println(c);
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
