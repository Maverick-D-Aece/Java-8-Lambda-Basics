import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DriverUsingJava7 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("FirstName", "LastName", 10), new Person("Mappy", "Person", 23),
                new Person("Maverick", "D. Aece", 25));

        // sort the list by last name using the Comparator Interface
        Collections.sort(persons, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }

        });

        printList(persons);
        System.out.println();

        printLastNameStartingWithM(persons);
    }

    // create a method that prints all elements in the list
    private static void printLastNameStartingWithM(List<Person> persons) {
        for (Person p : persons) {
            if (p.getFirstName().charAt(0) == 'm' || p.getFirstName().charAt(0) == 'M') {
                System.out.println(p);
            }
        }
    }

    // create a method that prints all people that have first name beginning with M
    private static void printList(List<Person> persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}