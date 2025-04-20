import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Strings {

    public static String removeSpecialChar(String str) {

        String ans = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        return ans;
    }

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        s = s.replaceAll("[^A-Za-z0-9]", "");
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

      //  List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
            if(map.containsKey(sortedString)){
                map.get(sortedString).add(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedString, list);
            }
            
        }

    //   result =;

        return  map.values().stream().collect(Collectors.toList());
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < b.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}