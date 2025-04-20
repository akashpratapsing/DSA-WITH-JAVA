import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Union {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
        ArrayList<Integer> union = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i : a) {
            set.add(i);
        }
        for (int i : b) {
            set.add(i);
        }
        for (Integer i : set) {
            union.add(i);
        }
        Collections.sort(union);

        return union;
    }
}
