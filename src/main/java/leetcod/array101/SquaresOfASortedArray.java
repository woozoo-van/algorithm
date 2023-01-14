package leetcod.array101;

import java.util.Arrays;

public class SquaresOfASortedArray { // square : 제곱
    public int[] sortedSquares(int[] nums) {
        int[] square = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            square[i] = (nums[i] * nums[i]);
        }
        Arrays.sort(square);

        return square;
    }
}
