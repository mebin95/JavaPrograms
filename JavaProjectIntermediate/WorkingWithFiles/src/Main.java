import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("Adam", "Developer", 21);
        Person p1 = new Person("Barry", "Teacher", 33);
        Person p2 = new Person("Charlie", "Doctor", 35);
        Person p3 = new Person("Dave", "Accountant", 41);
        Person p4 = new Person("Emily", "Nurse", 27);

        ArrayList<Person> listOfPeople = new ArrayList<Person>();

        listOfPeople.add(p);
        listOfPeople.add(p1);
        listOfPeople.add(p2);
        listOfPeople.add(p3);
        listOfPeople.add(p4);

        Person person = new Person();

        String FILENAME = "C:/Users/Administrator/Desktop/JavaProjectIntermediate/WorkingWithFiles/personDetails.txt";

        person.writeToFile(listOfPeople, FILENAME);
        person.readFromFile(FILENAME);


    }


}
