// Name: Didarul Alam
// Lab Instructors: Tianyu Gao (D)
// Course: CSCI 212-211

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;

        do {
            System.out.print("Enter a number between 2 and 5: ");
            n = scan.nextInt();
        } while (n < 2 || n > 5);


        for(int i=1; i<=10; i++) {
            System.out.print((int)Math.pow(n, i) + " ");
        }

    }

}