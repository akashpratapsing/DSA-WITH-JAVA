import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable {

    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    public HashTable(int b){
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    public void insert(Integer k){
        int i = k % BUCKET;
        table.get(i).add(k);
    }

    public boolean search(Integer k){
        int i = k % BUCKET;
        return table.get(i).contains(k);
    }

    public void remove(Integer k){
        int i = k % BUCKET;
        table.get(i).remove(k);
    }

    public void displayTable(){
        
        System.out.println(table.toString());
    }

    public static void main(String[] args) {
        HashTable mh = new HashTable(7);
	    mh.insert(10);
	    mh.insert(20);
	    mh.insert(15);
	    mh.insert(7);
        mh.displayTable();
	    System.out.println(mh.search(10));
	    mh.remove(15);
        mh.displayTable();
	    System.out.println(mh.search(15));
    }
}