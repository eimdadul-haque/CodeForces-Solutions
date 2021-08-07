import java.util.Scanner;

/**
 * A_In_Search_of_an_Easy_Problem
 */
public class A_In_Search_of_an_Easy_Problem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        Solve(arr);
        input.close();
    }

    public static void Solve(int[] arr) {
        
        int zero =0, one =0;
        for (int i : arr) {
            if (i == 0) {
                zero = zero + 1;        
            }
            else if ( i == 1) {
                one = one + 1;
            }
        }

        if (zero == arr.length) {
            System.out.print("EASY");
        }
        else{
            System.out.print("HARD");
        }
    }
}