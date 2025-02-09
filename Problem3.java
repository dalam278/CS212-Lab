// Name: Didarul Alam
// Lab Instructors: Tianyu Gao (D)
// Course: CSCI 212-211


import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        while (n <= 0) {
            System.out.println("Invalid input!");
            System.out.print("Enter a positive integer: ");
            n = scanner.nextInt();
        }

        int[] inputs = new int[n];

        System.out.println("Now enter " + n + " more integers:");
        for (int i = 0; i < n; i++) {
            inputs[i] = scanner.nextInt();
        }

        int count = 0;
        for (int num : inputs) {
            if (num % 2 != 0) {
                count++;
            }
        }

        System.out.println(count + " were odd.");

        scanner.close();
    }

}
