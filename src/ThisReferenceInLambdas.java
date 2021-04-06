public class ThisReferenceInLambdas {

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceInLambdas thisReferenceInLambdas = new ThisReferenceInLambdas();
        thisReferenceInLambdas.doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            // System.out.println(this); // Cannot use this in static context
        });

        thisReferenceInLambdas.execute();
    }

    public String toString() {
        return "Main ThisReferenceLambdas class instance";
    }

}
