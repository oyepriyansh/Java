import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input the number whether to check if it is prime or not ");

        boolean ans = PrimeOrNot(in.nextInt());

        if (ans) {
            System.out.println("Yes, its a prime number");
        }
        else {
            System.out.println("no the input is not prime number");
        }
    }
    static boolean PrimeOrNot(int n) {
        int c = 2;
        while (c<n){
            if (n%c ==0) {
                return false;
            }
            c = c+1;
        }
        return true;
    }
}
