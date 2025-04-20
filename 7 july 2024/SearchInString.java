public class SearchInString {
    

    static boolean search(String str, char target){

        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }

        return false;
    }

    static int search2(String str, char target){

        if(str.length() == 0){
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }

        return -1;
    }

    
    public static void main(String[] args) {
        

        String str = "Aakash";
        char target = 's';

        //boolean result = search(str, target);

        int result = search2(str, target);
        System.out.println(result);
    }
}
