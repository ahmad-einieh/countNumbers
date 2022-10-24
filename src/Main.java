import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        do {
            System.out.print("Enter a number: ");
            int temp = sc.nextInt();
            if (temp > 0) {
                a++;
            } else if (temp < 0) {
                b++;
            } else {
                c++;
            }

            System.out.print("Do you want to continue? (y/n): ");
            String temp1 = sc.next();
            if (temp1.equals("n")) {
                break;
            }
        } while (true);

        System.out.println("\nPositive numbers: " + a);
        System.out.println("Negative numbers: " + b);
        System.out.println("Zeroes: " + c);

    }
}