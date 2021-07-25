import java.util.Scanner;

/**
 * A_Nearly_Lucky_Number
 */
public class A_Nearly_Lucky_Number {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String number = input.nextLine();
        Solve(number);
    }

    public static void Solve(String ch) {

        int count = 0;
        char[] arrOfChar = ch.toCharArray();
        int[] arr = new int[arrOfChar.length];

        for (int i = 0; i < arrOfChar.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(arrOfChar[i]));
        }

        for (int i : arr) {
            if (i == 4 || i == 7) {
                count++;
            }
        }

        if (count == 4 | count == 7) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}