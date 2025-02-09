import java.util.Scanner;

public class Lab3_Problem3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three integer:");
         int a = input.nextInt();
         int b = input.nextInt();
         int c = input.nextInt();
         int sum = a + c + b;
        System.out.println("Sum of three integer :"+ sum );
         input.close();


    }
}
