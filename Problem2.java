// Name: Didarul Alam
// Lab Instructors: Tianyu Gao (D)
// Course: CSCI 212-211

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("Enter a positive integer: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input!");
                scanner.next();
            }

            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input!");
            }

        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }

    }

}

