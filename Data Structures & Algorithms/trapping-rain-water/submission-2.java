class Solution {
    public int trap(int[] height) {
        
        int n=height.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];

        int lmax=height[0];
        leftmax[0] = 0;
        for(int i=1;i<n;i++)
        {
            lmax = Math.max(lmax, height[i-1]);
            leftmax[i] = lmax;
        }
        int rmax = height[n-1];
        rightmax[n-1] = 0;
        for(int j=n-2;j>=0;j--)
        {
            rmax = Math.max(rmax, height[j+1]);
            rightmax[j] = rmax;
        }

        int res=0;
        for(int i=0;i<n;i++)
        {
//coz cant add Negative water when height is itself greater then both left and right
            if(Math.min(leftmax[i], rightmax[i]) > height[i])
                res = res + Math.min(leftmax[i], rightmax[i]) - height[i];
        }

        return res;
 
    }
}
