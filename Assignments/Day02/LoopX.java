// Run a loop until the user enters x.
import java.util.Scanner;

public class LoopX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char x = 'a';
        char realx = 'x';
        
        while (x != realx) {
            x = in.next().charAt(0);
            System.out.println(x);
        }

    }
}