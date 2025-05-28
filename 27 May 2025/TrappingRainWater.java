public class TrappingRainWater {
    public int trap(int[] height) {

        int total = 0, left = 0, right = height.length - 1, leftMax = 0, rightMax = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (leftMax > height[left]) {
                    total += leftMax - height[left];
                } else {
                    leftMax = height[left];
                }
                left++;
            } else {
                if (rightMax > height[right]) {
                    total += rightMax - height[right];
                } else {
                    rightMax = height[right];
                }
                right--;
            }
        }

        return total;
    }
}
