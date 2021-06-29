import java.util.*;

public class A_Boy_or_Girl {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        input.close();

        int state = Solution(name);
        if (state % 2 == 0) {
            System.out.print("CHAT WITH HER!");
        } else {
            System.out.print("IGNORE HIM!");
        }
    }

    public static int Solution(String name) {

        HashSet<Character> hashSet = new HashSet<Character>();
        char[] chrList = name.toCharArray();
        for (char c : chrList) {
            hashSet.add(c);
        }
        return hashSet.size();
    }
}