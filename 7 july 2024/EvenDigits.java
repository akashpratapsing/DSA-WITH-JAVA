public class EvenDigits {

    static int countEvenDigits(int[] arr){

        if (arr.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            
          //  int element = Integer.toString(arr[i]).length();
          int element = countDig(arr[i]);

            if (element % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
    static int countDig(int n){

        int count = 0;
        int num = n;

        while (num != 0) {
            
            num = num / 10;
            count++;

        }
        return count;
    }
    public static void main(String[] args) {
        
        int[] arr = {5, 12, 586, 1254, 8552, 25, 4};

      //  int result = countEvenDigits(arr);

     //   System.out.println(result);

      //  System.out.println(countDig(589654));

      System.out.println(Integer.toString(0).length());
    }
}
