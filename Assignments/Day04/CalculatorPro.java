import java.util.Scanner;

public class CalculatorPro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int answer = 0;

        while (true) {
            System.out.print("Enter the operator ");
            char opr = in.next().trim().charAt(0);

            if (opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%') {
                System.out.println("Enter two numbers");
                int x = in.nextInt();
                int y = in.nextInt();

                if (opr == '+') {
                    answer = x + y;
                }
                if (opr == '-') {
                    answer = x - y;
                }
                if (opr == '*') {
                    answer = x * y;
                }
                if (opr == '/') {
                    if (y!=0) {
                        answer = x / y;
                    }
                }
                if (opr == '%') {
                    answer = x % y;
                }
            }
            else if (opr == 'x' || opr == 'X') {
                break;
            }
            else {
                System.out.println("Invalid Operation");
            }
            System.out.println(answer);
        }
    }
}

