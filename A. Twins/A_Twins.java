import java.util.Scanner;
/**
 * A_Twins
 */
public class A_Twins {

    public static int solution(int n, String str) {
        int needed = 0, remain = 0;
        var strarr = str.split(" ");
        var arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(strarr[i]);
        }
        var Sortarr = sort(arr);

        for (int i = 0; i < n; i++) {
            remain = 0;
            needed = needed + Sortarr[i];
            for (int j = i + 1; j < n; j++) {
                remain = remain + Sortarr[j];
            }
            if (needed > remain) {
                return i + 1;
            }
        }
        return 0;
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String str = input.nextLine();
        System.out.println(solution(n, str));
        input.close();
    }
}