class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        //No Extra space method as the array is sorted

        int left = 0;
        int right = numbers.length-1;

        while(left<right)
        {
            if(numbers[left]+numbers[right]==target)
                return new int[]{left+1, right+1};
            if(numbers[left]+numbers[right]<target)
                left++;
            if(numbers[left]+numbers[right]>target)
                right--;
        }

        return new int[0];



        /* extra space method
        Map<Integer, Integer> mp = new HashMap<>();
        int n=numbers.length;
        for(int i=0;i<n;i++)
        {   
            if(mp.containsKey(target-numbers[i])){
                //this below line is same as those 4 commented lines below it
                return new int[]{mp.get(target-numbers[i])+1, i+1};
                // int[] res = new int[2];
                // res[0] = mp.get(target-numbers[i])+1;
                // res[1] = i+1;
                // return res;
            }
            else
                mp.put(numbers[i], i);
        }
        return new int[0];
        */

    }
}
