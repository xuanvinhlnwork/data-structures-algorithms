package lesson1.array;

public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++){
            if (nums[j] != val){
                nums[j] = nums[j];
                i++;
            }
        }

        return i;
    }
}
