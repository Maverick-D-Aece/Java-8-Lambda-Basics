public class ClosuresInLambda {

    public static void main(String[] args) {
        int a = 10;
        int b = 20; // this is treated as effectively final starting from Java 8 - any attempt to
                    // change this from within or outside of the lambda expression will result in a
                    // compile time error

        doProcess(a, i -> System.out.println(i + b));
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
