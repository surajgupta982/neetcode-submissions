class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        Set<Character> c = new HashSet<>();

        int i=0;int j=0;
        int n=s.length();
        int res = 0;
       // int count =0;
        while(j<n)
        {
            if(!c.contains(s.charAt(j)))
            {
                c.add(s.charAt(j));
                j++;
                res = Math.max(res, c.size());
            }
            else
            {
                c.remove(s.charAt(i));
                i++;
              //  count=0;
            }
        }

        return res;



        /* brute force O(n^2)
        int n = s.length();
        int res = 0;
        for(int i=0;i<n;i++)
        {
            Set<Character> c = new HashSet<>();
            c.add(s.charAt(i));
            int count = 1;
            int j=i;
            while(++j<n)
            {
                //j++;
                if(!c.contains(s.charAt(j)))
                {
                    count++;
                    c.add(s.charAt(j));
                }
                else
                    break;
            }
            res = Math.max(res, count);
        }
        return res;
        */
    }
}
