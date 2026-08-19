class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        // by default java intitialize all with 0 only
        int[] res = new int[n];
        Arrays.fill(res, 0);
        
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()])
            {
                int k = st.pop();
                res[k] = i-k;
            }
            st.push(i);
        }
        return res;

    }
}
