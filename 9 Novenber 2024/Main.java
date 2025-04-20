import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
        System.out.println(Strings.removeSpecialChar(str));

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

       System.out.println(Strings.groupAnagrams(strs));
    }
}