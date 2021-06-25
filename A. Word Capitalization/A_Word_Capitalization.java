import java.util.Scanner;

public class A_Word_Capitalization{
    public static void main(String[] args){
        var input = new Scanner(System.in);
        String Word = input.next();
        input.close();

        wordCapitalization(Word);
    }

    public static void wordCapitalization(String Word){
        char[] a = Word.toCharArray();
        a[0] = Character.toUpperCase(a[0]);
        for (char c : a) {
            System.out.print(c);
        }
    }
}