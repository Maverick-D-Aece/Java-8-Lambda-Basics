import java.util.List;
import java.util.Arrays;

public class StreamsInJava8 {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("FirstName", "LastName", 10), new Person("Mappy", "Person", 23),
                new Person("Maverick", "D. Aece", 25));

        // filters and prints all the persons in this list that have their first names
        // starting with "M"
        persons.stream().filter(p -> p.getFirstName().startsWith("M"))
                .forEach(p -> System.out.println(p.getFirstName()));

        long count = persons.stream().filter(p -> p.getFirstName().startsWith("M")).count();
        System.out.println("Number of persons having first names that start with an 'M' = " + count);

        // using parallelism through .parallelStream() method on the collection while
        // creating the stream in the first place
        long count1 = persons.parallelStream().filter(p -> p.getFirstName().startsWith("M")).count();
        System.out.println("Number of persons having first names that start with an 'M' = " + count1);

        // parallelism is more pronounced in the following example
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Using stream() -");
        numbers.stream().forEach(i -> System.out.print(i + ", "));
        System.out.println("\nUsing parallelStream() -");
        numbers.parallelStream().forEach(i -> System.out.print(i + ", "));
    }
}