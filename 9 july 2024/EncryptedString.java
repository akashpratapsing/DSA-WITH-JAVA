/**
 * EncryptedString
 */
public class EncryptedString {

    public static String getEncryptedString(String s, int k) {

        // String enc = "";
        // int num = 0;
        
        // for (int i = 0; i < s.length(); i++){
        //     num = (i + k) % s.length();
        //     enc += s.charAt(num);
        // }

        // return enc;

        return s.substring(k) + s.substring(0, k);
    }
    public static void main(String[] args) {
        
        String s = "dart";

        int k = 3;

        System.out.println(getEncryptedString(s, k));
        
    }
}