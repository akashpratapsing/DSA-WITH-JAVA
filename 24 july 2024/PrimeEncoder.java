public class PrimeEncoder {
    
    public static int[] primeEncoder(int[] input1, int input2) {

        int nthPrime = findNthPrime(input2);   
        int[] output = new int[input1.length];

        for (int i = 0; i < input1.length; i++) {
            output[i] = input1[i] + nthPrime;
        }

        return output;
    }

    public static int findNthPrime(int n) {
        int count = 0;
        int num = 1;
        int prime = 2;

        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
                prime = num;
            }
        }
        
        return prime;
    }

   
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;

        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // Sample Test Cases
        int[] input1 = {1, 2, 3};
        int input2 = 2;
        int[] output = primeEncoder(input1, input2);
        System.out.println("Output: " + java.util.Arrays.toString(output)); // [4, 5, 6]

        int[] input3 = {10, 20, 30};
        int input4 = 5;
        int[] output2 = primeEncoder(input3, input4);
        System.out.println("Output: " + java.util.Arrays.toString(output2)); // [21, 31, 41]

        int[] input5 = {100, 200, 300};
        int input6 = 1;
        int[] output3 = primeEncoder(input5, input6);
        System.out.println("Output: " + java.util.Arrays.toString(output3)); // [102, 202, 302]
    }
}

