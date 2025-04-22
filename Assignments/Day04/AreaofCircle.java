import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius ");
        double r = in.nextDouble();
        double pi = (3.14); 
        double area = pi*r*r;

        System.out.println("Area is " + area);
    }
}