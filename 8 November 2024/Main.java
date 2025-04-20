import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // String str = "aaaaabbbccc";
        // int[] candies = { 2, 5, 6, 78, 9, 4, 8 };
        // System.out.println(MaxCandies.kidsWithCandies(candies, 70));

        // System.out.println(DeleteCharacter.makeFancyString(str));

        int[] numbers = { 2, 3, 4, 6, 7, 8, 9, 56 };
        int target = 65;

        int[] result = TwoSum.twoSum2(numbers, target);
        System.out.println(Arrays.toString(result));

        
    }

}