package leetcod.beginner;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int[] account : accounts) {
            int currentTotal = 0;
            for (int wealth : account) {
                currentTotal += wealth;
            }
            if (currentTotal > max) {
                max = currentTotal;
            }
        }
        return max;
    }

    public int maximumWealth2(int[][] accounts) {
        int max = 0;

        for (int[] account : accounts) {
            int currentTotal = 0;
            for (int wealth : account) {
                currentTotal += wealth;
            }
            max = Math.max(max, currentTotal);
        }
        return max;
    }
    // time complexity = O(n x m)
    // space complexity = O(1)
}
