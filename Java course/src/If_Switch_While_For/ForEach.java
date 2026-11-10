package If_Switch_While_For;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 0, 0};
        for (int num : numbers) {
            System.out.print(num + " "); // 1 2 3 0 0
        }

        ArrayList<String> strings = new ArrayList<>();
        strings.add("ABC");
        strings.add("DEF");
        strings.add("GHI");
        for (String item : strings) {
            System.out.print(item + " "); // ABC DEF GHI
        }
    }
}
