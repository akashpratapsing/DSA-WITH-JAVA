/**
 * RemainingString
 */
public class RemainingString {


    static String printString(String s, char ch, int count){


        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == ch && count > 0) {
                count--;
                idx = i;
            }
        }

    
        if (idx < s.length() && count == 0) {
            return s.substring(idx + 1);
        }
        else {
            return "";
        }

        
    }
    public static void main(String[] args) {


        String s = "aaaaa";
        char ch = 'a';
        int count = 2;

    
        System.out.println(printString(s, ch, count));


        


    }
}