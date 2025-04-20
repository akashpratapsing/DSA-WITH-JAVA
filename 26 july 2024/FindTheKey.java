public class FindTheKey {

    /*
     * You are provided with 3 numbers: input1, input2 and input3.
     * 
     * Each of these are four digit numbers within the range >= 1000 and <=9999.
     * i.e.
     * 
     * 1000 <= input1 <= 9999
     * 
     * 1000 <= input2 <= 9999
     * 
     * 1000 <= input3 <= 9999
     * 
     * You are expected to find the Key using the below formula -
     * 
     * Key = (Sum of Largest digits of all the 3 numbers) + (Sum of Smallest digits
     * of all the 3 numbers) For e..g. if input1 = 3521, input2=2452, input3=1352,
     * then Key = (5+5+5) + (1+2+1) = 19
     * 
     */

    static int findKey(int input1, int input2, int input3) {

        int large1 = findLargestDigit(input1);
        int large2 = findLargestDigit(input2);
        int large3 = findLargestDigit(input3);

        int small1 = findSmallestDigit(input1);
        int small2 = findSmallestDigit(input2);
        int small3 = findSmallestDigit(input3);

        int key = (large1 + large2 + large3) + (small1 + small2 + small3);
        return key;
    }

    static int findLargestDigit(int number) {

        int largestDigit = Integer.MIN_VALUE;
        int temp;

        while (number != 0) {
            temp = number % 10;

            if (temp > largestDigit) {
                largestDigit = temp;
            }

            number /= 10;
        }

        return largestDigit;
    }

    static int findSmallestDigit(int number) {

        int smallestDigit = Integer.MAX_VALUE;
        int temp;

        while (number != 0) {
            temp = number % 10;

            if (temp < smallestDigit) {
                smallestDigit = temp;
            }

            number /= 10;
        }

        return smallestDigit;
    }

    public static void main(String[] args) {

        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int key = findKey(input1, input2, input3);
        System.out.println("Key: " + key);
    }
}