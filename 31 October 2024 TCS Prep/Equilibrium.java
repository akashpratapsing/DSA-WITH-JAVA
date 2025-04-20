public class Equilibrium {

    public static int equilibriumIndex(int[] arr) {

        int rSum = 0;
        int lSum = 0;

        for (int i = 0; i < arr.length; i++) {
            rSum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            rSum -= arr[i];
            if (lSum == rSum) {
                return i + 1;
            }
            lSum += arr[i];
        }
        return -1;
    }
}
