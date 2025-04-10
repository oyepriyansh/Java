// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number ");
        int num1 = in.nextInt();

        System.out.print("Enter the operation symbol (+, -, *, /, ) ");
        char opr = in.next().charAt(0);

        System.out.print("Enter the second number ");
        int num2 = in.nextInt();
                
        if (opr == '+') {
            System.out.println(num1+num2);
        }
        else  if (opr == '-') {
            System.out.println(num1-num2);
        }
        else  if (opr == '*') {
            System.out.println(num1*num2);
        }
        else  if (opr == '/') {
            System.out.println(num1/num2);
        }
        else {
            System.out.println("Invalid operation");
        }
    }
}