package leetcod.array101;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digit = 0;
            int consum = num;
            while (consum > 0) {
                consum = (int) (consum * 0.1);
                digit++;
            }
            count = digit % 2 == 0 ? count + 1 : count;
        }
        return count;
    }
}
