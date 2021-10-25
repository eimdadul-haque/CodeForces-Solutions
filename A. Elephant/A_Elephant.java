import java.util.Scanner;

/**
 * A_Elephant
 */
public class A_Elephant {

    public static int solution(int x) {
        int remain = 0;
        int res = 0;

        if (x >= 5) {
            res = res + (x / 5);
            remain = x % 5;
        }
        if (remain >= 4) {
            res = res + (remain / 4);
            remain = x % 4;
        }
        if (remain >= 3) {
            res = res + (remain / 3);
            remain = x % 3;
        }
        if (remain >= 2) {
            res = res + (remain / 2);
            remain = x % 2;
        }
        if (remain >= 1) {
            res = res + (remain / 1);
            remain = x % 1;
        }
        return res;
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println(solution(input.nextInt()));
        input.close();
    }
}