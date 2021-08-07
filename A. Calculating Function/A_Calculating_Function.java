import java.util.Scanner;

/**
 * A_Calculating_Function
 */
public class A_Calculating_Function {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution(input.nextInt());
        input.close();
    }

    public static void Solution(int fn) {
        int result = 0, vari =0;
        for(int i =1; i<=fn; i++){
            if (i%2==0) {
                vari = +(i);
            }
            else{
                vari = -(i);
            }
            result = result + vari;
        }

        System.out.print(result);
    }
}