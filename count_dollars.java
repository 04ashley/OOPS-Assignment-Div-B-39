import java.io.*;
import java.util.Scanner;

public class count_dollars {
    public static void main(String[] args) {
        int quaters;
        int dimes;
        int nickels;
        int pennies;
        Scanner stdio = new Scanner(System.in);
        double dollars;
        System.out.println("Enter the number of quaters : ");
        quaters = stdio.nextInt();
        stdio.nextLine();
        System.out.println("Enter the number od dimes : ");
        dimes = stdio.nextInt();
        stdio.nextLine();
        System.out.println("Enter the number of nickels : ");
        nickels = stdio.nextInt();
        stdio.nextLine();
        System.out.println("Enter the number of pennies : ");
        pennies = stdio.nextInt();
        stdio.nextLine();
        dollars = (0.25 * quaters) + (0.10 * dimes) + (0.05 * nickels) + (0.01 * pennies);
        System.out.println();
        System.out.println("The total in dollars is $");
        System.out.printf("%1.2f", dollars);
        System.out.println();
    }
}