import java.util.Scanner;

/**
 * A_Anton_and_Danik
 */
public class A_Anton_and_Danik {

    public static String solution() {

        int A = 0, D = 0;
        var input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            char ch = input.next().charAt(0);
            if (ch == 'A') {
                A++;
            }
            if (ch == 'D') {
                D++;
            }
        }
        input.close();
        if (A > D) {
            return "Anton";
        } else if (D > A) {
            return "Danik";
        } else {
            return "Friendship";
        }
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }
}