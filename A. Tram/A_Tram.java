import java.util.Scanner;

/**
 * A_Tram
 */
public class A_Tram {
    private static Scanner input = new Scanner(System.in);

    public static int solution() {
        int capacity = 0, result = 0, n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            result = result + (-a) + (+b);
            if (result > capacity) {
                capacity = result;
            }
        }

        return capacity;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }
}