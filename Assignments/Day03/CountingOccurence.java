// count the repeatation of a digit in a number, take input from user of number and digit both

import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = in.nextInt();

        System.out.println("enter the digit ");
        int d = in.nextInt();
        int count = 0;

        while (n>0) {
            int x = n%10;
            if (x == d) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
