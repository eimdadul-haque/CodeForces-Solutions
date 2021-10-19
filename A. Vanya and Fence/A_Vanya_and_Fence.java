import java.util.Scanner;

/**
 * A_Vanya_and_Fence
 */
public class A_Vanya_and_Fence {

    public static int soluton() {
        var input = new Scanner(System.in);
        int w = 0;
        int n = input.nextInt();
        int h = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (h >= input.nextInt()) {
                w++;
            } else {
                w += 2;
            }
        }
        return w;
    }

    public static void main(String[] args) {
        System.out.println(soluton());;
    }
}