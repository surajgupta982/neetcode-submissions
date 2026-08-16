class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(target - nums[i]))
            {
                int[] arr = new int[2];
                arr[0] = mp.get(target-nums[i]);
                arr[1] = i;
                return arr;
            }
            else
            {
                mp.put(nums[i], i);
            }
        }

        return new int[2];

    }
}
