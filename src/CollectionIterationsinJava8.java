import java.util.List;
import java.util.Arrays;

public class CollectionIterationsinJava8 {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("FirstName", "LastName", 10), new Person("Mappy", "Person", 23),
                new Person("Maverick", "D. Aece", 25));

        // using the forEach() method of a Collection and passing a lambda expression as
        // an argument
        System.out.println("\nUsing Simple Lambda Expression");
        persons.forEach(p -> System.out.println(p));

        // using Method Reference for the same
        System.out.println("\nUsing Method Reference");
        persons.forEach(System.out::println);
    }
}
