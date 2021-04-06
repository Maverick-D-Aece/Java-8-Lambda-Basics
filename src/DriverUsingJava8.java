import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DriverUsingJava8 {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("FirstName", "LastName", 10), new Person("Mappy", "Person", 23),
                new Person("Maverick", "D. Aece", 25));

        // sort the list by last name using the Comparator Interface
        Collections.sort(persons, (o1, o2) -> {
            return o1.getLastName().compareTo(o2.getLastName());
        });

        // create a method that prints all elements in the list
        /*
         * Done using Stream API
         * 
         * persons.stream().forEach(person -> System.out.println(person.toString()));
         */
        printConditionally(persons, p -> true, p -> System.out.println(p));

        // create a method that prints all people that have first name beginning with M
        /*
         * Done using Stream API
         * 
         * persons.stream().filter(person -> person.getFirstName().startsWith("m") ||
         * person.getFirstName().startsWith("M")).forEach(person ->
         * System.out.println(person));
         */
        printConditionally(persons, p -> p.getFirstName().startsWith("m") || p.getFirstName().startsWith("M"),
                p -> System.out.println(p.getFirstName()));
    }

    // here, Predicate is an interface for the condition behaviour lambda expresison
    // and Consumer is an interface for the printing behaviour lambda expression
    private static void printConditionally(List<Person> persons, Predicate<Person> predicate,
            Consumer<Person> consumer) {
        for (Person p : persons) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
