// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SI {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal Amount ");
        int p = input.nextInt();

        System.out.print("Enter the Time Period ");
        int t = input.nextInt();
         
        System.out.print("Enter the Interest Rate ");
        int r = input.nextInt();

        int SI = p*r*t/100;

        System.out.println("total simple interest is " + SI);
        
    }
}