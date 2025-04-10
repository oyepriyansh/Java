// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargeNumber {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first num ");
        int num1 = in.nextInt();

        System.out.print("Enter the second num ");
        int num2 = in.nextInt();

        if (num1>num2) {
            System.out.println(num1 + " is larger number");
        }
        else {
            System.out.println(num2 + " is larger number");
        }
    }
}