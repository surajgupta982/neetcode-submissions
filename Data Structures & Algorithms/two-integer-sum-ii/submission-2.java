class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer, Integer> mp = new HashMap<>();

        int n=numbers.length;
        for(int i=0;i<n;i++)
        {   
            if(mp.containsKey(target-numbers[i])){
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

    }
}
