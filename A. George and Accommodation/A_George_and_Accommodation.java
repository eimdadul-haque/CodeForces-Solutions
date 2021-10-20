import java.util.Scanner;

/**
 * A_George_and_Accommodation
 */

public class A_George_and_Accommodation {
    public static Scanner input = new Scanner(System.in);

    public static int Solution(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            int p = input.nextInt();
            int q = input.nextInt();

            if (p < q) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(Solution(input.nextInt()));
    }
}