import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is largest number");
        }
        else if (b > a && b > c) {
            System.out.println(b+ " is largest numbr");
        }
        else {
            System.out.println(c + " is largest number");
        }
    }
}
