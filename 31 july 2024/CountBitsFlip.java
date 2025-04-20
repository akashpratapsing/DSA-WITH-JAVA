public class CountBitsFlip {

    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b) {

        int xor = a ^ b;
        int count = 0;

        while (xor != 0) {

            if ((xor & 1) == 1) {
                count++;
            }
            xor >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {

        int a = 10, b = 20;
        System.out.println("Number of bits to flip: " + countBitsFlip(a, b));

    }
}
