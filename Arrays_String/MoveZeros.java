package Arrays_String;
import java.util.Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int lastNonZeroFoundAt = 0;
        
        // If the element is non-zero, swap it with the element at lastNonZeroFoundAt
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeros solver = new MoveZeros();
        int[] nums = {0, 1, 0, 3, 12};
        
        solver.moveZeroes(nums);
        System.out.println("Array after moving zeroes: " + Arrays.toString(nums));
    }
}