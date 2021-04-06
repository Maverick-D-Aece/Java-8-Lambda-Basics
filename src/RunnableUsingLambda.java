public class RunnableUsingLambda {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Printed inside new thread -> inside the Runnable");
            }

        });

        thread.run();

        Thread lambdaThread = new Thread(
                () -> System.out.println("Printed inside the Runnable using lambda expression"));
        lambdaThread.run();
    }
}
