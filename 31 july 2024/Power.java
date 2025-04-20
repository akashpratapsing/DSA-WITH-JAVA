public class Power {

    // Using Bit Manipulation
    static int power(int base, int power){

        int ans = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            base *= base;
            power >>= 1;
        }

        return ans;
    }

    // Using Brute Force
    static int calPower(int base, int power){

        int ans = 1;
        while (power > 0) {
            ans *= base;
            power--;
        }
        return ans;
    }

    // Using InBuilt Function
    static int calculatePower(int base, int power){
        return (int) Math.pow(base, power);
    }


    public static void main(String[] args) {

        System.out.println(calculatePower(2, 15));
        
    }
}
