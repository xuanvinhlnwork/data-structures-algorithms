package lesson1.array;

public class LeetCode1295 {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int x = nums[i];
            int numDigital = 0;

            while (x > 0) {
                x /= 10;
                numDigital++;
            }
            if (numDigital % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
