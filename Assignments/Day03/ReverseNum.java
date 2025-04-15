//write a program to reverse the digits in the output of given string

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int result = 0;

        while (num>0) {
            int x = num%10;
            num = num / 10;
            result = result*10+x;
        }
        System.out.println(result);
    }
}
