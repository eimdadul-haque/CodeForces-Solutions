import java.util.Scanner;

public class A_Stones_on_the_Table {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String str = input.next();
        char[] chrArr = str.toCharArray(); 
        input.close();
        int Count = Stones_on_Table(chrArr, num);
        System.out.print(Count);
    }

    public static int Stones_on_Table(char[] chr, int num) {
        int rockCount = 0;
        for (int i = 0; i < num - 1; i++) {

            if (chr[i] == chr[i + 1]) {
                rockCount++;
            }
        }

        return rockCount;
    }
}