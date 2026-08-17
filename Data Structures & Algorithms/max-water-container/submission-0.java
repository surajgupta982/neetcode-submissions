class Solution {
    public int maxArea(int[] heights) {

        //see my leetcode solution for better code(clean variable names)
        int n=heights.length;
        int i=0;
        int j=n-1;
        int res=0;
        while(i<j)
        {
            int area = (j-i)*Math.min(heights[i], heights[j]);
            res = Math.max(res, area);
            if(heights[i]<heights[j])
                i++;
            else
                j--;
        }
        return res;
        
    }
}
