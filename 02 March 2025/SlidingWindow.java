import java.util.HashMap;
import java.util.Map;

class SlidingWindow {

    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        int i = 0;
        int j = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (map.size() == j - i + 1) {
                len = Math.max(len, j - i + 1);
            }
            while (map.size() < j - i + 1) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);

                if (map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;
            }
            j++;
        }

        return len;
    }

    public static void main(String[] args) {

        String str = "pwwkew";

        System.out.println(lengthOfLongestSubstring(str));
    }
}