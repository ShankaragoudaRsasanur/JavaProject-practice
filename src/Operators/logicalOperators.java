package Operators;


public class logicalOperators {

    public static void main(String[] args) {

        int age = 22;
        boolean hasId = true;
        boolean hasLicense = false;
        boolean criminalRecord = false;

        // AND Operator
        System.out.println("AND Operator:");
        System.out.println(age >= 18 && hasId);

        // OR Operator
        System.out.println("\nOR Operator:");
        System.out.println(hasId || hasLicense);

        // NOT Operator
        System.out.println("\nNOT Operator:");
        System.out.println(!criminalRecord);

        // Combined Logical Operators
        System.out.println("\nCombined Logical Operators:");

        boolean eligible =
                age >= 18
                && hasId
                && !criminalRecord;

        System.out.println("Eligible = " + eligible);
    }
}
