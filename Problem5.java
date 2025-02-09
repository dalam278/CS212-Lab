// Name: Didarul Alam
// Lab Instructors: Tianyu Gao (D)
// Course: CSCI 212-211

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for n : ");
        int n = scanner.nextInt();

        while(n <= 0 || n % 2 == 0) {
            System.out.println("Invalid input. Please enter an odd positive integer.");
            n = scanner.nextInt();
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {

                if(j == i) {
                    System.out.print("X");
                }
                else if(i == 0 || i == n-1) {
                    System.out.print("O");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        scanner.close();

    }

}