import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[] { 1, 2, 3 };

        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};

        // System.out.println(NonRepeatingElement.firstNonRepElement(array));

        // System.out.println(NonRepeatingElement.firstNonRepElementOptimized(array));
        // RotateArray.rotate(array, 7);
        // RotateArray.rotateWithExtraSpace(array, 5);
        // RotateArray.rotateOptimized(array, 5);
        // System.out.println(Equilibrium.equilibriumIndex(array));
        // System.out.println(Arrays.toString(array));

        System.out.println(SubsetOfAnotherArray.isSubset2(arr1, arr2));
    }

}
