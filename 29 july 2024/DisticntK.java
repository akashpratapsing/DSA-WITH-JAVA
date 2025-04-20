import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class DisticntK {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

      //  String[] str = new String[n];

      //    Set<String> set = new HashSet<>();

       LinkedHashMap<Integer, String> set 
            = new LinkedHashMap<>(); 


        for (int i = 1; i <= n; i++){
           String str = sc.next();
           if (set.containsValue(str)) {
            set.g
           }
         
           set.put(i, str);
        }

        int k = sc.nextInt();



        System.out.println(set);
    }
}
