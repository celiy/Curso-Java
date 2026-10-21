package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arr_ays {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // {0, 0, 0, 0, 0}

        numbers[0] = 5; // {5, 0, 0, 0, 0}
        numbers[4] = 10; // {0, 0, 0, 0, 10}

        // can be done like this
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
        // or like this
        for (int num : numbers) System.out.println(num);

        int[] rawNumbers = {1, 2, 3, 0, 0};
        int[] asObject = new int[] {6, 2, 1};

        // Methods
        // Sort
        int[] unsortedNumbers = {3, 4, 2, -2, 0, 10};
        Arrays.sort(unsortedNumbers); // { -2, 0, 2, 3, 4, 10}

        char[] unsortedCharacters = {'a', 'z', 'B', 'D'};
        Arrays.sort(unsortedCharacters); // {'a', 'B', 'D', 'z'}

        int[] unsortedUnicodes = {'a', 'b', 'c'};
        Arrays.sort(unsortedUnicodes); // {65, 67, 68}

        String[] unsortedStrings = {"hij", "abc", "efg"};
        Arrays.sort(unsortedStrings); // abc, efg, hij

        // Searching
        int[] numToSearch = {2, 3, 4};
        Arrays.binarySearch(numToSearch, 3); // 1

        // Comparing
        int[] numCompare1 = {1, 2, 3};
        int[] numCompare2 = {1, 2, 3};
        int[] numCompare3 = {1, 2, 4};
        Arrays.equals(numCompare1, numCompare2); // true
        Arrays.equals(numCompare1, numCompare3); // false

        // Filling
        int[] numbersToFill1 = new int[10]; // {0, 0, .. 0, 0}
        Arrays.fill(numbersToFill1, 3); // {3, 3, .. 3, 3}

        int[] numbersToFill2 = new int[10];
        Arrays.fill(numbersToFill2, 3, 7, 5); // 0, 0, 0, 5, 5, 5, 5, 0, 0, 0

        // To string
        Arrays.toString(numbersToFill1);
    }
}
