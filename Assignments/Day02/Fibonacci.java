import java.util.Scanner;

public class Fibonacci {
    static class Solution {
        public int fib(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;

            int a = 0;
            int b = 1;

            int count = 2;
            while (count<=n) {
                int temp = b;
                b = a + b;
                a = temp;
                count++;
            }
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n");
        Solution sol = new Solution();
        int result = sol.fib(in.nextInt());
        System.out.println(result);

    }
}