//public class loopsproblem {
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 4; i++) {
//            int power = 1;
//            for (int j = 1; j <= i; j++) {
//                power = power * i;
//            }
//
//            System.out.println(i + "^" + i + " = " + power);
//            sum = sum + power;
//        }
//
//        System.out.println("Sum = " + sum);
//    }
//}
//     


import java.util.Scanner;

public class loopsproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        // Outer loop: numbers from 1 to n
        for (int i = 1; i <= n; i++) {

            int power = 1;

            // Inner loop: calculate i^i


         for (int j = 1; j <= i; j++) {
                power = power * i;
            }

            System.out.println(i + "^" + i + " = " + power);

            sum = sum + power;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}