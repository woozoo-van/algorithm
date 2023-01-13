package leetcod.beginner;

public class RunningSumOf1DArray {
    public int[] runningSun(int[] nums) {
        int numsLength = nums.length;
        int[] result = new int[numsLength];

        result[0] = nums[0];
        for (int i = 1; i < numsLength; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
        // time complexity = O(n)
        // space complexity = O(1)
    }

    public int[] runningSun2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
        // time complexity = O(n)
        // space complexity = O(1)
    }
}


