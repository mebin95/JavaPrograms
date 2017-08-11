import java.util.ArrayList;
import java.util.List;

public class People {

    private String name;
    private int age;
    private String jobTitle;

    public People(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public static void main(String[] args) {

        People person1 = new People("John", 21, "Software Developer");
        People person2 = new People("Melvin", 32, "Cashier");
        People person3 = new People("Tom", 27, "Graphic Designer");

//        System.out.println(person1.getName());
//        System.out.println(person1.getAge());
//        System.out.println(person1.getJobTitle());

        ArrayList<People> listOfPeople = new ArrayList<>();

        listOfPeople.add(person1);
        listOfPeople.add(person2);
        listOfPeople.add(person3);

//        for(People p : listOfPeople) {
//            System.out.println(p.getName());
//        }

        searchByName("John");

    }

    static void searchByName(String name) {
        People person1 = new People("John", 21, "Software Developer");
        People person2 = new People("Melvin", 32, "Cashier");
        People person3 = new People("Tom", 27, "Graphic Designer");

        ArrayList<People> listOfPeople = new ArrayList<>();

        listOfPeople.add(person1);
        listOfPeople.add(person2);
        listOfPeople.add(person3);

        for(People p : listOfPeople) {
            if(name == p.getName()) {
                System.out.println(p.getName());
            }
        }
    }
}
