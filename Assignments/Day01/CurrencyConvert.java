// Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyConvert {
    public static void main (String[] args) {

        System.out.println("Currency Convert Rupees to USD");

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount in rupees ");
        float rs = input.nextFloat();

        System.out.print("Google the current USD to INR ratio and enter here ");
        float usdRatio = input.nextFloat();

        float usdAmount = rs/usdRatio;
        System.out.println("You have " + usdAmount + " USD");

    }
}
