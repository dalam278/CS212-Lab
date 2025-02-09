// Name: Didarul Alam
// Lab Instructors: Tianyu Gao (D)
// Course: CSCI 212-211

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a large integer n: ");
        int n = scanner.nextInt();

        int count = 0;
        int prev = n;

        while (count < 4) {
            System.out.print("Type a smaller value of n: ");
            int curr = scanner.nextInt();

            if (curr >= prev) {
                System.out.println("Goodbye");
                break;
            }

            prev = curr;
            count++;
        }

        scanner.close();

    }

}