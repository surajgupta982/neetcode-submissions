class Solution {
    public int longestConsecutive(int[] nums) {
        
         Arrays.sort(nums);

        int i=0;
        int j=1;
        int n=nums.length;

        if(n==1)
            return 1;
        if(n==0)
            return 0;

        for(int k=0;k<n;k++)
            System.out.println(nums[k]);

        int res=1;
        int count=1;

        while(i<n && j<n)
        {
            if(nums[i]==nums[j])
            {
                i++;j++;
                continue;
            }
            if(nums[j]-nums[i]==1)
                count++;
            else
                count = 1;

            i++;j++;
            res = Math.max(res, count);
        }
        return res;

    }
}
