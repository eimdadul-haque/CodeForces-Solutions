import java.util.Scanner;

/**
 * A. Soldier and Bananas
 */
public class Soldier_and_Bananas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        int w = input.nextInt();
        input.close();

        int needMoney = Solution(k, n, w);
        System.out.print(needMoney);

    }

    public static int Solution(int k, int n, int w) {

        int total = 0;

        for (int i = 1; i <= w; i++) {
            total = total + (i * k);
        }

        if (total - n < 0) {
            return 0;
        } else {
            return total - n;
        }

    }
}