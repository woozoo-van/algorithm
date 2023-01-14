package leetcod.array101;

public class MaxConsecutiveOnes {
    public static int findMacConsecutiveOnes(int[] nums) { // consecutive : 연이은
        int count = 0;
        int before = 0;
        int max = 0;
        for (int num: nums) {
            if (num == 1) {
                count++;
            } else {
                if (before == 1) {
                    max = Math.max(max, count);
                }
                count = 0;
            }
            before = num;
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMacConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
        System.out.println(findMacConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}
