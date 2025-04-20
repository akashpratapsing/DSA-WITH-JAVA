import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
    
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxInCandies = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList<>();

        for (int candie : candies) {
            if (candie > maxInCandies) {
                maxInCandies = candie;
            }
        }

        for (int candie : candies) {
            result.add(candie + extraCandies >= maxInCandies);
        }

        return result;
    }
}
