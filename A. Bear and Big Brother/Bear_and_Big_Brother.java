import java.util.Scanner;

/**
 * Bear_and_Big_Brother
 */
public class Bear_and_Big_Brother {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();

        int year = Solution(a, b);
        System.out.print(year);
    }

    public static int Solution(int a, int b) {
        int year = 0;
        if (b >= a) {
            while (true) {

                if (a <= b) {
                    year++;
                } else {
                    break;
                }

                a = a * 3;
                b = b * 2;
            }
        }
        return year;
    }
}