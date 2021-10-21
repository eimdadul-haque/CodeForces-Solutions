import java.util.Scanner;

public class A_Even_Odds {
    static Scanner input = new Scanner(System.in);
    static String str = "";

    public static int solution(int n, int k) {

        for (int i = 1; i <= n; i += 2) {
            str = str + Integer.toString(i);
        }

        for (int i = 2; i <= n; i += 2) {
            str = str + Integer.toString(i);
        }

        return Character.getNumericValue(str.charAt(k-1));
    }

    public static void main(String[] args) {
        System.out.println(solution(input.nextInt(), input.nextInt()));
    }
}