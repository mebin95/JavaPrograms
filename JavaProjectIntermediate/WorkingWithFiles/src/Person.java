import java.io.*;
import java.util.ArrayList;

public class Person {

    private String name;
    private String occupation;
    private int age;

    public Person(String name, String occupation, int age) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "," + occupation + "," + age;
    }

    public void writeToFile(ArrayList<Person> listOfPeople, String FILENAME) {

        File fileTemp = new File(FILENAME);
        if (fileTemp.exists()){
            fileTemp.delete();
        }

        for(Person per : listOfPeople) {

            try (BufferedWriter out = new BufferedWriter(new FileWriter(FILENAME, true))) {

                String content = per.toString();

                out.write(content);
                out.newLine();

                //System.out.println("Done");

            } catch (IOException e) {

                e.printStackTrace();

            }

        }
    }

    public void readFromFile(String FILENAME) {

        ArrayList<Person> listOfPeoples = new ArrayList<Person>();

            try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    Person pn = new Person(parts[0],parts[1], Integer.parseInt(parts[2]));
                    listOfPeoples.add(pn);

                }


            } catch (IOException e) {

                e.printStackTrace();

            }

        }
    }

