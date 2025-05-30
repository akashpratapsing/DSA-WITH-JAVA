import java.util.*;
public class Anagrams {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
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

    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};

        Arrays.sort(strs);

        System.out.println(Arrays.toString(strs));
    }
}
