public class Main {

    public static void main(String[] args) {
  
        Item arr[] = {new Item(10, 60), 
            new Item(40, 40), 
            new Item(20, 100),
            new Item(30, 120)};
        System.out.println(FractionalKnapsack.fracKnapSack(arr, 1, 10));

    }
}
