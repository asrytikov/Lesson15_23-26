package p6;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<People> peoples = new ArrayList<>();
        peoples.add(new People("Alex", 34, 1.7, true));
        peoples.add(new People("Ivan", 23, 1.9, false));


        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("people.dat"))){
            //People people = new People("Alex", 34, 1.7, true);
            objectOutputStream.writeObject(peoples);
        }catch (IOException exception){
            exception.printStackTrace();
        }

        ArrayList<People> newPeoples = new ArrayList<>();
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("people.dat"))){
            //People people = (People) objectInputStream.readObject();
            newPeoples = ((ArrayList<People>) objectInputStream.readObject());
            //System.out.printf("Name: %s Age: %d \n", people.getName(), people.getAge());
        }catch (Exception exception){
            exception.printStackTrace();
        }

        for (People people: newPeoples){
            System.out.printf("Name: %s Age: %d Height: %.2f \n", people.getName(), people.getAge(), people.getHeight());
        }
    }

}
