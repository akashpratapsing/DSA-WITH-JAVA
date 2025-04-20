import java.util.Arrays;
import java.util.Collection;

class ReverseWords {

    static String reverse(String s) {

        String[] arr = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i > 0 ; i--) {
            sb.append(arr[i] + " ");
        }
        sb.append(arr[0]);

        return sb.toString();
    }

    public static void main(String[] args) {

        String str =  "         example   good a     ";

     //  System.out.println(str.strip());

        
        String[] newArr = str.trim().split("\\s+");
        System.out.println(Arrays.toString(newArr));

     

        System.out.println(reverse(str));
    }
}