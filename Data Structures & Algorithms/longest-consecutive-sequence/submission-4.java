class Solution {
    public int longestConsecutive(int[] nums) {
        

        Set<Integer> s = new HashSet<>();

        for(Integer num : nums)
            s.add(num);

        int res=0;
        for(Integer num : nums)
        {
            int count=1;
          //trigger it only for first element of a unique sequence
            if(!s.contains(num-1))
            {
                int p = num;
                while(s.contains(p+1))
                {
                    count++;
                    p++;
                }
                res = Math.max(res, count);
            }
        } 

        return res;


        /* nlogn solution
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
        */

    }
}
