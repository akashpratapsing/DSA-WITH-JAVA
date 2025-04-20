public class Recursion {

    static boolean isSorted(int[] nums, int i) {

        if (i == nums.length - 1) {
            return true;
        }
        if (nums[i] > nums[i + 1]) {
            return false;
        }

        return isSorted(nums, i + 1);
    }

    static boolean linearSearch(int[] nums, int target, int index){

        if (index == nums.length) {
            return false;
        }

        return (nums[index] == target) || linearSearch(nums, target, index + 1);
    }

    public static void main(String[] args) {

        int[] array = { 1, 2, 0, 4, 5 };

       // System.out.println(isSorted(array, 0));
       System.out.println(linearSearch(array, 7, 0));
    }
}
