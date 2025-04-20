import java.util.*;

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        if (N <= 0){
           System.out.println("Wrong Input");
           return;
        } 

        int[] Arr = new int[N];    
       for (int i = 0; i < N; i++) {
    

            if (N == 0){
            System.out.println("Wrong input extra");
            return;
           }
/**
 *        if (!sc.hasNextInt()){
 *         System.out.println("Wrong input");
 *           return;
 *        }
**/
            Arr[i] = sc.nextInt();
            if (Arr[i] < 0){
             System.out.println("Wrong input");
             return;
            }
       
          
         
        }
       

   //      if (sc.hasNextLine()){
   //        System.out.println("Wrong input extra");
   //         return;
   //      }
 
         
   
        Arrays.sort(Arr);
        int minSum = Arr[0]; 
        for (int i = 1; i < N; i++) {
            if (Arr[i] <= Arr[i - 1]) {
                Arr[i] = Arr[i - 1] + 1; 
            }
            minSum += Arr[i]; 
        }

     
        System.out.println(minSum);
    }
}
