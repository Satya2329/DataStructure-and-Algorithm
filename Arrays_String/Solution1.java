package Arrays_String;
import java.util.Arrays;

public class Solution1 {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        
        int n = nums.length;
        int[] answer = new int[n];
        
        // Step 1: Calculate left products and store them in the answer array
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }
        
        // Step 2: Multiply by right products on the fly using a running variable
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct *= nums[i];
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution1 solver = new Solution1();
        int[] nums = {1, 2, 3, 4};
        
        int[] result = solver.productExceptSelf(nums);
        System.out.println("Product except self: " + Arrays.toString(result));
    }
}