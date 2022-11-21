import java.io.*;

public class question4 {
    public static void main(String[] args) {
        double value = 0, ans = 0;
        System.out.println("\n");
        for (int i = 1; i < 97; i++) {
            int cos = (i + (i + 1) / ((i + 2) * (i + 4)));
            System.out.print("cos" + cos + " + ");
            if (i == 16 || i == 31 || i == 46 || i == 61 || i == 76 || i == 91) {
                System.out.print("\n");
            }
            if (i == 96) {
                System.out.print("cos" + cos);
            }
            value = Math.cos(cos);

            ans = ans + value;
        }

        System.out.println("\n");

        System.out.print("Answer for above Equation :  " + ans);
        System.out.println("\n");

    }

}