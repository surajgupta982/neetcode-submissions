class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int n = piles.length;
        int mx=0;
        int k=1;
        for(int num : piles)   
            mx = Math.max(mx, num);
        
        int res = mx;
        while(k<=mx)
        {
            int mid = k + (mx-k)/2;
            double temp=0;
            for(int i=0;i<n;i++)
            {
                temp = temp + Math.ceil((double)piles[i]/mid);
            }
            if(temp<=h)
            {
                res = Math.min(res, mid);
                mx = mid-1;
                continue;
            }
            k=mid+1;
        }

        return res;

    }
}
