/* 
 * Lambda Expressions in Java can be thought of as syntactical sugar for Anonymous Inner Classes
 */

public class LambdaBasics {

    public static void main(String[] args) throws Exception {

        // lambda function examples
        GreetInterface greetingFunction = () -> System.out.println("Hello Lambda!");
        DoubleInterface doubleNumberFunction = a -> a * 2; // shortest and most compact way to write a lambda expression
        AddInterface addFunction = (a, b) -> a + b;
        DivideInterface safeDivide = (a, b) -> {
            if (b == 0)
                return 0;
            return a / b;
        };

        // type inference at its best
        printLength(s -> s.length());

        // runnig the lambda expressions
        greetingFunction.foo();
        System.out.println(doubleNumberFunction.foo(20));
        System.out.println(addFunction.foo(10, 15));
        System.out.println(safeDivide.foo(20, 2));
    }

    // passing lambda expression as a function argument
    public static void printLength(StringLengthInterface sll) {
        System.out.println(
                "Length of the string is - " + sll.foo("This is a very long string. Count my length if you dare!"));
    }
}

// Functional Interfaces
@FunctionalInterface
interface GreetInterface {
    void foo();
}

@FunctionalInterface
interface DoubleInterface {
    int foo(int a);
}

@FunctionalInterface
interface AddInterface {
    int foo(int a, int b);
}

@FunctionalInterface
interface DivideInterface {
    double foo(int a, int b);
}

@FunctionalInterface
interface StringLengthInterface {
    int foo(String s);
}