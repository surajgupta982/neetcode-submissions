class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] res = new int[n];

        // Step 1: Compute prefix products directly in res
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply suffix products in-place from the right
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        return res;

    }
}  
