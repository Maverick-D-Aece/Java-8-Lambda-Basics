
public class MethodReferencesInJava8 {

    public static void main(String[] args) {
        // Thread thread = new Thread(() -> printMessage()); // The old way

        // Method Reference to a static method of the class
        Thread thread = new Thread(MethodReferencesInJava8::printMessage);
        thread.start();

        /**
         * There are other types of method references as well --
         * 
         * Method Reference to an instance method of the class
         * 
         * Method Reference to a method of one particular type
         * 
         * Method Reference to a constructor of the class
         */
    }

    public static void printMessage() {
        System.out.println("Hello Method!");
    }
}