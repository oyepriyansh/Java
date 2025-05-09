import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bahubali(in.nextInt());

    }
    static void bahubali(int n) {
        int input = n;
        int r = 0;
        int add = 0;
        while (input>0) {
            r = input % 10;
            add += (r*r*r);
            input = input/10;
        }
        if (n == add) {
            System.out.println("Yes " + n + " is a ArmStrong Number");
        }
        else {
            System.out.println("No " + n + " is not an ArmStrong Number");
        }
    }
}
